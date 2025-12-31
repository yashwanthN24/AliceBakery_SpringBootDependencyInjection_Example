package com.example.demo.AliceBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("StrSyu")
@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
