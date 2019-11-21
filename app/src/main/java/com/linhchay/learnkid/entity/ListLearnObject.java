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
        learnObjectList.add(new LearnObject("object_caighe", "Cái Ghế", "Chair", "number_one", "number_one"));
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
        learnObjectList.add(new LearnObject("object_caiban", "Cái Bàn", "Table", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caighe", "Cái Ghế", "Chair", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caitivi", "Cái Tivi", "The television", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_xemay", "Xe Máy", "Motorbike", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_xedap", "Xe Đạp", "Bike", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_oto", "Ô Tô", "Car", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_butchi", "Bút Chì", "Pencil", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_quyensach", "Quyển Sách", "Book", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_capsach", "Cặp Sách", "Bag", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_dienthoai", "Điện Thoại", "Phone", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_tulanh", "Tủ Lạnh", "Fridge", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_cailuoc", "Cái Lược", "Comb", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_doigiay", "Đôi Giày", "Shoes", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caio", "Cái Ô", "Umbrella", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caikeo", "Cái Kéo", "Scissors", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caiquat", "Cái Quạt", "Fan", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caicoc", "Cái Cốc", "Cup", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caimu", "Cái Mũ", "Hat", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_bongden", "Bóng đèn", "Light bulb", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caigoi", "Cái Gối", "Pillow", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_dongho", "Đồng Hồ", "Clock", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caichoi", "Cái Chổi", "Broom", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_maybay", "Máy Bay", "Planes", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_caigiuong", "Cái Giường", "Bed", "number_one", "number_one"));

        return learnObjectList;
    }

    public static List<LearnObject> getNumbersList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("number_khong", "Số Không", "Zero", "number_one", "number_eng_khong"));
        learnObjectList.add(new LearnObject("number_mot", "Số Một", "One", "number_one", "number_eng_mot"));
        learnObjectList.add(new LearnObject("number_hai", "Số Hai", "Two", "number_one", "number_eng_hai"));
        learnObjectList.add(new LearnObject("number_ba", "Số Ba", "Three", "number_one", "number_eng_ba"));
        learnObjectList.add(new LearnObject("number_bon", "Số Bốn", "Four", "number_one", "number_eng_bon"));
        learnObjectList.add(new LearnObject("number_nam", "Số Năm", "Five", "number_one", "number_eng_nam"));
        learnObjectList.add(new LearnObject("number_sau", "Số Sáu", "Six", "number_one", "number_eng_sau"));
        learnObjectList.add(new LearnObject("number_bay", "Số Bảy", "Seven", "number_one", "number_eng_bay"));
        learnObjectList.add(new LearnObject("number_tam", "Số Tám", "Eight", "number_one", "number_eng_tam"));
        learnObjectList.add(new LearnObject("number_chin", "Số Chín", "Nine", "number_one", "number_eng_chin"));
        learnObjectList.add(new LearnObject("number_muoi", "Số Mười", "Ten", "number_one", "number_eng_muoi"));
        return learnObjectList;
    }

    public static List<LearnObject> getAlphabetListVN() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("alphabet_a_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_a_2", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_a_3", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_b", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_c", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_d_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_d_2", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_e_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_e_2", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_g", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_h", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_i", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_k", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_l", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_m", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_n", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_o_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_o_2", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_o_3", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_p", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_q", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_r", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_s", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_t", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_u_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_u_2", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_v", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_x", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_y", "1", "1", "number_one", "number_one"));

        return learnObjectList;
    }

    public static List<LearnObject> getAlphabetListENG() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("alphabet_a_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_b", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_c", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_d_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_e_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_f", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_g", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_h", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_i", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_j", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_k", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_l", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_m", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_n", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_o_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_p", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_q", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_r", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_s", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_t", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_u_1", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_v", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_w", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_x", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_y", "1", "1", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("alphabet_z", "1", "1", "number_one", "number_one"));

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
