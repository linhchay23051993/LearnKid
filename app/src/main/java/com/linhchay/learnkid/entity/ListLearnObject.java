package com.linhchay.learnkid.entity;

import java.util.ArrayList;
import java.util.List;

public class ListLearnObject {
    static List<LearnObject> learnObjectList;

    public static List<LearnObject> getAnimals() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("conbo", "Con Bò", "Cows", "number_one", "number_four"));
        learnObjectList.add(new LearnObject("conga", "Con Gà", "Cock", "number_two", "number_five"));
        learnObjectList.add(new LearnObject("conchim", "Con Chim", "Birds", "number_three", "number_six"));
        learnObjectList.add(new LearnObject("concho", "Con Chó", "Dog", "number_one", "number_seven"));
        learnObjectList.add(new LearnObject("conmeo", "Con Mèo", "Cat", "number_two", "number_four"));
        learnObjectList.add(new LearnObject("contrau", "Con Trâu", "Buffalo", "number_three", "number_five"));
        learnObjectList.add(new LearnObject("convit", "Con Vịt", "Duck", "number_one", "number_six"));

        return learnObjectList;
    }
}
