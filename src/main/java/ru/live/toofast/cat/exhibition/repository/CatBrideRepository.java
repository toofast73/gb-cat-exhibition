package ru.live.toofast.cat.exhibition.repository;

import ru.live.toofast.cat.exhibition.model.Cat;

import java.util.HashSet;
import java.util.Set;

public class CatBrideRepository {

    private Set<Cat> brides;

    public CatBrideRepository(Set<Cat> brides) {
        this.brides = brides;
    }

    public Cat getBride(){
        return brides.iterator().next();
    }


}
