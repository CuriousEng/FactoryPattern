package com.company.female;

import com.company.AbstractFactory;
import com.company.Human;

public class FemaleFactory<T extends Human> implements AbstractFactory {

    public T getPerson(int age){
        if(age <= KidGirl.MAX_AGE){
            return (T) new KidGirl();
        } else if (age <= TeenGirl.MAX_AGE && age > KidGirl.MAX_AGE){
            return (T) new TeenGirl();
        } else
            return (T) new Woman();
    }
}
