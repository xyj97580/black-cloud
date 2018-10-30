package com.xyj.cloud.common.annotion.jsr;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Created by xyj97 on 2018/10/22.
 */
public class RangeStrConstraintValidator implements ConstraintValidator<RangeStrConstraint,String>{

    private String[] values;
    @Override
    public void initialize(RangeStrConstraint rangeStrConstraint) {
        values = rangeStrConstraint.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return Arrays.asList(values).contains(s);
    }
}
