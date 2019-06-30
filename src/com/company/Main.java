package com.company;

import com.company.female.FemaleFactory;
import com.company.male.MaleFactory;

public class Main {
    public static void main(String[] args){
        MaleFactory maleFactory = new MaleFactory();
        System.out.println(maleFactory.getPerson(99));
        System.out.println(maleFactory.getPerson(4));
        System.out.println(maleFactory.getPerson(15));

        FemaleFactory femaleFactory = new FemaleFactory();
        System.out.println(femaleFactory.getPerson(99));
        System.out.println(femaleFactory.getPerson(4));
        System.out.println(femaleFactory.getPerson(15));
    }

}
