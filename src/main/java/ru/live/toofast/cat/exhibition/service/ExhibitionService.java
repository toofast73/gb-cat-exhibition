package ru.live.toofast.cat.exhibition.service;

import ru.live.toofast.cat.exhibition.model.Cat;
import ru.live.toofast.cat.exhibition.repository.CatBrideRepository;
import ru.live.toofast.cat.exhibition.validator.CatValidator;
import ru.live.toofast.cat.exhibition.validator.MaineKoonValidator;

import java.util.Optional;

public class ExhibitionService {

    private CatBrideRepository catBrideRepository;
    private CatValidator validator;

    public ExhibitionService(CatBrideRepository catBrideRepository, CatValidator validator) {
        this.catBrideRepository = catBrideRepository;
        this.validator = validator;
    }

    //0..1
    //returns Optional[Cat or Null]
    public Optional<Cat> findBride(Cat cat){
        if (cat.isCertified()){
            return Optional.of(getBride());
        } else {
            boolean isCertified = validator.tryCertify(cat);
            if(isCertified){
                return Optional.of(getBride());
            }
        }

        return Optional.empty();
    }

    private Cat getBride() {
        return catBrideRepository.getBride();
    }


}
