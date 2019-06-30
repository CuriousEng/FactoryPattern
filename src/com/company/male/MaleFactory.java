package com.company.male;

import com.company.AbstractFactory;
import com.company.Human;

public class MaleFactory<T extends Human> implements AbstractFactory {

    public T getPerson(int age){
        if(age <= KidBoy.MAX_AGE){
            return (T) new KidBoy();
        } else if (age <= TeenBoy.MAX_AGE && age > KidBoy.MAX_AGE){
            return (T) new TeenBoy();
        }
        return (T) new Man();
    }
}
