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
            return false;
        } else if(part.getInv() < part.getMin() || part.getInv() > part.getMax()) {
            return false;
        } else {
            return true;
        }
    }
}
