package com.xyj.cloud.exceptionhander;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Iterator;
import java.util.List;


/**
 * Created by xyj97 on 2018/10/19.
 */


@RestControllerAdvice
public class ExceptionHande {

    @ExceptionHandler(value=BindException.class)
    public String handler(BindException e) {
        System.out.println("--------");
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        StringBuilder builder = new StringBuilder();
        /*for ( FieldError error:fieldErrors) {
            builder.append(error.getDefaultMessage() + "|");
        }*/
        Iterator<FieldError> iterator = fieldErrors.iterator();
        if(iterator.hasNext()) {
            FieldError next = iterator.next();
            builder.append(next.getDefaultMessage());
            if(iterator.hasNext()) {
                builder.append("|");
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    public String handler(MethodArgumentNotValidException e) {
        System.out.println("--------");
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        StringBuilder builder = new StringBuilder();
        /*for ( FieldError error:fieldErrors) {
            builder.append(error.getDefaultMessage() + "|");
        }*/
        Iterator<FieldError> iterator = fieldErrors.iterator();
        while(iterator.hasNext()) {
            FieldError next = iterator.next();
            builder.append(next.getDefaultMessage());
            if(iterator.hasNext()) {
                builder.append("|");
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}
