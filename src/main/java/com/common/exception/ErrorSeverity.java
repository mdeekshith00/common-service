package com.common.exception;

import lombok.Getter;

@Getter
public enum ErrorSeverity {
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private final String description;
    ErrorSeverity(String description) {
        this.description = description;
    }

}
