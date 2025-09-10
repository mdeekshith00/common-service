package com.common.exception;

import lombok.Getter;


@Getter
public enum ErrorCategory {
    APPLICATION("Application specific error."),
    SYSTEM("System specific error."),
    REQUEST("Request specific error."),
    DATA("Data/DB specific error.");

    private final String description;
    ErrorCategory(String description) {
        this.description = description;
    }

}
