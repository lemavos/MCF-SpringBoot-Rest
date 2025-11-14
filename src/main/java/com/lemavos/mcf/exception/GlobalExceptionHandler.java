package com.lemavos.mcf.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // validator erros catch
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgument(MethodArgumentTypeMismatchException ex){
        return ResponseEntity.badRequest().body(
                Map.of(
                    "error", "Invalid Argument",
                    "message", ex.getMessage()
            )
        );
    }
}
