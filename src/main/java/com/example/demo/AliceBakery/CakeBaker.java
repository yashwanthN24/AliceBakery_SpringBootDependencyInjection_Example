package com.example.demo.AliceBakery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {


    private Frosting f;
    private Syrup s;

    public CakeBaker(@Qualifier("chocofrost") Frosting f1 ,@Qualifier("StrSyu") Syrup s1){
        this.f = f1;
        this.s = s1;
    }

    public void bakeCake(){
        System.out.println(
                "Baking cake with " + f.getFrostingType() +
                        " frosting and " + s.getSyrupType() + " syrup"
        );
    }
}
