package com.booking_management.Exception;


import com.booking_management.DTO.respone.ApiRespone;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalApiException {


    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<ApiRespone> handlingRuntimeException(RuntimeException exception){
        ApiRespone respone = ApiRespone.builder().code(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(exception.getMessage()).build();
        return ResponseEntity.internalServerError().body(respone);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<ApiRespone> handlingMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        ApiRespone respone = ApiRespone.builder().code(HttpStatus.BAD_REQUEST.value()).message(exception.getFieldError().getDefaultMessage()).build();
        return ResponseEntity.badRequest().body(respone);
    }
}
