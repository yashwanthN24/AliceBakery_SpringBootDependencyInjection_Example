package com.example.demo.AliceBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Qualifier("chocosyrup")
//@Primary
@Component
public class ChocolateSyrup implements Syrup{

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
