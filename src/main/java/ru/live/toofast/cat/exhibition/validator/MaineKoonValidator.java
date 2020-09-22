package ru.live.toofast.cat.exhibition.validator;

import ru.live.toofast.cat.exhibition.model.Cat;

/**
 * Main Koon validator
 */
public class MaineKoonValidator implements CatValidator {
    //Always returns value
    @Override
    public Boolean tryCertify(Cat cat) {
        if(cat.getBreed() == null){
            return false;
        }

        switch (cat.getBreed()){
            case MAINE_KOON:
                return true;
            case ORIENTAL:
                return false;
        }
        return false;
    }
}
