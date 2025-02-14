package com.example.IDM.controller.BrandController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BrandDetailsNotAvailableAdvice {
    @ResponseBody
    @ExceptionHandler(BrandDetailNotAvailableException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String branddetilnotava(BrandDetailNotAvailableException ex){
        return ex.getMessage();
    }
}
