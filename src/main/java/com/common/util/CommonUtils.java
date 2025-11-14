package com.common.util;

import org.springframework.http.HttpStatus;

import com.common.constants.ErrorConstants;
import com.common.exception.BloodBankBusinessException;
import com.common.vo.SessionResponseVo;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtils {

    private CommonUtils() {
    }

    private static void verifyField(String firstField, String secondField, String fieldName) {
        log.debug("Verifying fields: {} -> {} , {}", fieldName, firstField, secondField);

        // Throw if null OR not equal
        if (firstField == null || secondField == null || 
            !firstField.equalsIgnoreCase(secondField)) {

            log.warn("Session validation failed: {} mismatch", fieldName);
            throw new BloodBankBusinessException(ErrorConstants.SESSION_VALIDATION , HttpStatus.BAD_GATEWAY,ErrorConstants.API_FAILURE); // " + fieldName
        }
    }

    private static SessionResponseVo sessionResponse() {
        try {
            return SessionUtil.retriveSession();
        } catch (JsonProcessingException e) {
            log.error("Error parsing session JSON", e);
            throw new BloodBankBusinessException(ErrorConstants.SESSION_VALIDATION_DATA, HttpStatus.BAD_GATEWAY,ErrorConstants.API_FAILURE); // " + fieldName
        }
    }

    public static void verifyUserId(String userId) {
        SessionResponseVo sessionResponseVO = sessionResponse();
        verifyField(userId, sessionResponseVO.getJWt_UserId(), "userId");
    }
}
