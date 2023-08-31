package de.ait.shop.validation.impl;

import de.ait.shop.validation.PasswordValidator;

public class PasswordValidatorImpl implements PasswordValidator {
    @Override
    public void validate(String password) {

        if (password == null || password.equals("") || password.equals(" ")) { // валидируем password
            throw new IllegalArgumentException("Password не может быть пустым");
        }
    }
}
