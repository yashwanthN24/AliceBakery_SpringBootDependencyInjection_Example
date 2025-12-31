package com.example.demo.AliceBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("chocofrost")
@Component
public class ChocolateFrosting implements  Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
