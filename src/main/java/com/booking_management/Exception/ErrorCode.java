package com.booking_management.Exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum ErrorCode {
    DATE_INVALID(3003,"Date should not be emty")
    ;

    int code;
       String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
