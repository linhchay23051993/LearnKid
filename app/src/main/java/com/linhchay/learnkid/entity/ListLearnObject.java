package com.linhchay.learnkid.entity;

import java.util.ArrayList;
import java.util.List;

public class ListLearnObject {
    private static final ListLearnObject INSTANCE = new ListLearnObject();
    static List<LearnObject> learnObjectList;

    public static ListLearnObject getInstance() {
        return INSTANCE;
    }

    public static List<LearnObject> getAnimalsList() {
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

    public static List<LearnObject> getObjectList() {
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

    public static List<LearnObject> getNumbersList() {
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

    public static List<LearnObject> getAlphabetListVN() {
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

    public static List<LearnObject> getAlphabetListENG() {
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

    public static List<LearnObject> getFruitList() {
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

    public static List<LearnObject> getFoodList() {
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

    public static List<LearnObject> getColorList() {
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

    public static List<LearnObject> getShapeList() {
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
