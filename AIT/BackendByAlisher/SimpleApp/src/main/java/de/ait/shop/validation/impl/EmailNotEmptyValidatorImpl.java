package de.ait.shop.validation.impl;

import de.ait.shop.validation.EmailValidator;

public class EmailNotEmptyValidatorImpl implements EmailValidator {
    @Override
    public void validate(String email) {
        if (email == null || email.equals("") || email.equals(" ")) { // валидируем email
            throw new IllegalArgumentException("Email не может быть пустым");
        }
    }
}
