package ru.live.toofast.cat.exhibition.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.live.toofast.cat.exhibition.model.Breed;
import ru.live.toofast.cat.exhibition.model.Cat;
import ru.live.toofast.cat.exhibition.validator.MaineKoonValidator;

class MaineKoonValidatorTest {

    @Test
    void positiveTryCertify() {
        Cat maine = new Cat();
        maine.setBreed(Breed.MAINE_KOON);

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertTrue(actual);
    }


    @Test
    void negativeTryCertify() {
        Cat maine = new Cat();
        maine.setBreed(Breed.ORIENTAL);

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertFalse(actual);
    }

    @Test
    void noBreedCertify() {
        Cat maine = new Cat();

        MaineKoonValidator catValidator = new MaineKoonValidator();

        boolean actual = catValidator.tryCertify(maine);

        Assertions.assertFalse(actual);
    }
}