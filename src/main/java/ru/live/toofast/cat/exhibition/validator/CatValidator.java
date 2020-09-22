package ru.live.toofast.cat.exhibition.validator;

import ru.live.toofast.cat.exhibition.model.Cat;

public interface CatValidator {

    Boolean tryCertify(Cat cat);
}
