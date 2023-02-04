package io.github.vendas.validation.constraintvalidation;

import java.util.List;

import io.github.vendas.validation.NotEmptyList;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotEmptyListValidator implements ConstraintValidator<NotEmptyList, List> {

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list != null && !list.isEmpty();

    }

    @Override
    public void initialize(NotEmptyList constraintAnnotation) {

    }

}
