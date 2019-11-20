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
        learnObjectList.add(new LearnObject("test_alphabet", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("test_alphabet_2", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("test_alphabet", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("test_alphabet_2", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("test_alphabet", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("conga", "Con Gà", "Cock", "number_two", "number_five"));
        learnObjectList.add(new LearnObject("test_alphabet", "Chữ A", "Duck", "number_one", "number_six"));
        learnObjectList.add(new LearnObject("conchim", "Con Chim", "Birds", "number_three", "number_six"));
        learnObjectList.add(new LearnObject("concho", "Con Chó", "Dog", "number_one", "number_seven"));
        learnObjectList.add(new LearnObject("conmeo", "Con Mèo", "Cat", "number_two", "number_four"));
        learnObjectList.add(new LearnObject("convit", "Con Vịt", "Duck", "number_one", "number_six"));
        return learnObjectList;
    }

    public static List<LearnObject> getObjectList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("alphabet_a_1", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_a_2", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_a_3", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_b", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_c", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_d_1", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_d_2", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_e_1", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_e_2", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_g", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_h", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_i", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_k", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_l", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_m", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_n", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_o_1", "1", "", "number_one", ""));
//        learnObjectList.add(new LearnObject("alphabet_o_2", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_o_3", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_p", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_q", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_r", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_s", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_t", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_u_1", "1", "", "number_one", ""));
//        learnObjectList.add(new LearnObject(	"alphabet_u_2",	"1",	"",	"number_one",	""	));
        learnObjectList.add(new LearnObject("alphabet_v", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_x", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_y", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_w", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_z", "1", "", "number_one", ""));
        learnObjectList.add(new LearnObject("alphabet_j", "1", "", "number_one", ""));

        return learnObjectList;
    }

    public static List<LearnObject> getNumbersList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("conbo", "Con Bò", "Cows", "number_one", "number_four"));
        learnObjectList.add(new LearnObject("conga", "Con Gà", "Cock", "number_two", "number_five"));
        learnObjectList.add(new LearnObject("conchim", "Con Chim", "Birds", "number_three", "number_six"));
        learnObjectList.add(new LearnObject("concho", "Con Chó", "Dog", "number_one", "number_seven"));
        learnObjectList.add(new LearnObject("conmeo", "Con Mèo", "Cat", "number_two", "number_four"));
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
        learnObjectList.add(new LearnObject("convit", "Con Vịt", "Duck", "number_one", "number_six"));

        return learnObjectList;
    }

    public static List<LearnObject> getBodyList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("conbo", "Con Bò", "Cows", "number_one", "number_four"));
        learnObjectList.add(new LearnObject("conga", "Con Gà", "Cock", "number_two", "number_five"));
        learnObjectList.add(new LearnObject("conchim", "Con Chim", "Birds", "number_three", "number_six"));
        learnObjectList.add(new LearnObject("concho", "Con Chó", "Dog", "number_one", "number_seven"));
        learnObjectList.add(new LearnObject("conmeo", "Con Mèo", "Cat", "number_two", "number_four"));
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
        learnObjectList.add(new LearnObject("convit", "Con Vịt", "Duck", "number_one", "number_six"));

        return learnObjectList;
    }
}
