package com.common.util;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.common.constants.ErrorConstants;
import com.common.exception.BloodBankBusinessException;
import com.common.vo.SessionResponseVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.env.Environment;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class SessionUtil {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final String BEARER_PREFIX = "Bearer ";

    private SessionUtil() {}

    public static SessionResponseVo retriveSession() throws JsonProcessingException {

        HttpServletRequest request = ((ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes())
                .getRequest();

        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith(BEARER_PREFIX)) {
            throw new BloodBankBusinessException(ErrorConstants.MISSING_AUTHORIZATION_HEADER,HttpStatus.BAD_GATEWAY,ErrorConstants.DB_FAILURE);
        }

        String jwt = authHeader.substring(BEARER_PREFIX.length());

        Environment env = WebApplicationContextUtils
                .getRequiredWebApplicationContext(request.getServletContext())
                .getEnvironment();

        String SECRET = env.getProperty("JWT_SECRET");

        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(SECRET.getBytes())
                    .parseClaimsJws(jwt)
                    .getBody();
        } catch (Exception e) {
            throw new BloodBankBusinessException(ErrorConstants.EXPIRY_JWT_TOKEN,HttpStatus.BAD_REQUEST,ErrorConstants.INVALID_DATA
            );
        }


        SessionResponseVo responseVo = new SessionResponseVo();
        responseVo.setJWt_UserId(String.valueOf(claims.get("userId")));
        responseVo.setUsername((String) claims.get("username"));
        responseVo.setPhone((String) claims.get("phone"));

        if (claims.get("roles") != null) {
            responseVo.setRole((List<String>) claims.get("roles"));
        }

        return responseVo;
    }
}

