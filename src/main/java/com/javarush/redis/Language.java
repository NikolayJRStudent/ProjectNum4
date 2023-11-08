package com.javarush.redis;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class Language {
    @Getter
    @Setter
    private String language;
    private Boolean isOfficial;
    @Setter
    @Getter
    private BigDecimal percentage;



    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }




}
