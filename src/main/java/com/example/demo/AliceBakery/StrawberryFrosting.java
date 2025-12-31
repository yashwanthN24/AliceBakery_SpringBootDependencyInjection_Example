package com.example.demo.AliceBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Qualifier("StrawFro")
@Component
public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
