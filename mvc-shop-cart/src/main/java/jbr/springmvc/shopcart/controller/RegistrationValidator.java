package jbr.springmvc.shopcart.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import jbr.springmvc.shopcart.model.User;

public class RegistrationValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return User.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required.username", "username is required");
  }
}
