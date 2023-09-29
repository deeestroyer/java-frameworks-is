package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinMaxValidator implements ConstraintValidator<ValidMinMax, Part> {
    @Autowired
    private ApplicationContext context;

    @Override
    public void initialize(ValidMinMax constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        PartService repo = context.getBean(PartServiceImpl.class);

        if (part.getMax() < part.getMin()) {
            addErrorMessage(constraintValidatorContext, "Maximum inventory must be greater than or equal to min inventory");
            return false;
        } else if(part.getInv() < part.getMin()) {
            addErrorMessage(constraintValidatorContext, "Low inventory alert! Inventory must be at or above the minimum");
            return false;
        } else if(part.getInv() > part.getMax()) {
            addErrorMessage(constraintValidatorContext, "Inventory at capacity! Inventory must be at or below the maximum");
            return false;
        }else {
            return true;
        }
    }

    private void addErrorMessage(ConstraintValidatorContext context, String message) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
    }
}


