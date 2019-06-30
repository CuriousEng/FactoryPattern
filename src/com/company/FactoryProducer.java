package com.company;


import com.company.female.FemaleFactory;
import com.company.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType{
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType factory){
        return (factory == HumanFactoryType.MALE) ? new MaleFactory() : new FemaleFactory();
    }
}
