package com.common.util;

import java.time.LocalDate;
import java.time.Year;
import java.util.concurrent.atomic.AtomicInteger;

public class BarCodeGeneratorUtil {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static String generate() {
        int next = counter.incrementAndGet();
        return String.format("%06d", next);
    }
	LocalDate year ;
	public static  Integer sequenceNumber = Integer.valueOf(generate());
	private String siteCode = "";
	String barcodeId = "BBK-" + Year.now() + "-" + siteCode  + "-" + String.format("%06d", sequenceNumber);

	public static String generateBarcode(String prefix, String centerCode) {
        return String.format("%s-%d-%s-%06d",prefix.toUpperCase(),Year.now().getValue(),centerCode.toUpperCase(),sequenceNumber);
    }

}
