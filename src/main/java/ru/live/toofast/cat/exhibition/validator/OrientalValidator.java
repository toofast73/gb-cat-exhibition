package ru.live.toofast.cat.exhibition.validator;

import ru.live.toofast.cat.exhibition.model.Cat;

public class OrientalValidator implements CatValidator{
    @Override
    public Boolean tryCertify(Cat cat) {
        return "Nya".equals(cat.getGreeting());
    }
}
