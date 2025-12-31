package com.common.util;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BloodSampleIdGenerator {


	    private static final SecureRandom random = new SecureRandom();

	    public static String generateSampleId(Integer labId) {
	        String datePart = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	        String labCode = String.format("LB%02d", labId);
	        String randomPart = generateRandomAlphaNumeric(5);
	        return String.format("SMP-%s-%s-%s", datePart, labCode, randomPart);
	    }

	    private static String generateRandomAlphaNumeric(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }
	

}
