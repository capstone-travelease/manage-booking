package com.booking_management.Exception;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiException extends RuntimeException {
     ErrorCode errorCode;


     public ApiException(ErrorCode errorCode){
         super(errorCode.getMessage());
         this.errorCode = errorCode;
     }

}
