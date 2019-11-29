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
        learnObjectList.add(new LearnObject("animals_concho", "Con Chó", "Dog", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conmeo", "Con Mèo", "Cat", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conga", "Con Gà", "Chicken", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conbo", "Con Bò", "Cows", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conlon", "Con Lợn", "Pig", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_contrau", "Con Trâu", "Buffalo", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_convit", "Con Vịt", "Duck", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conchim", "Chim Bồ Câu", "Pigeon", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conkien", "Con Kiến", "Ant", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conmuoi", "Con Muỗi", "Mosquito", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conech", "Con Ếch", "Frog", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conde", "Con Dê", "Goat", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conho", "Con Hổ", "Tiger", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_consutu", "Con Sư Tử", "Lion", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_convoi", "Con Voi", "Elephant", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conkhi", "Con Khỉ", "Monkey", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conca", "Con Cá", "Fish", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_concaheo", "Con Cá Heo", "Dolphin", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_congau", "Con Gấu", "Bear", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conbosua", "Con Bò sữa", "Milk cow", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conchuot", "Con Chuột", "Mouse", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_concua", "Con Cua", "Crab", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_contho", "Con Thỏ", "Rabbit", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_concasau", "Con Cá Sấu", "Crocodile", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_congautruc", "Con Gấu  Trúc", "Panda", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conlacda", "Con Lạc Đà", "Camel", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_contegiac", "Con Tê Giác", "Rhino", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conhama", "Con Hà Mã", "Hippopotamus", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("animals_conngua", "Con Ngựa", "Horse", "number_one", "number_one"));

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
        learnObjectList.add(new LearnObject("object_quabong", "Quả Bóng", "Ball", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("object_bongbay", "Bóng Bay", "Balloon", "number_one", "number_one"));

        return learnObjectList;
    }

    public static List<LearnObject> getNumbersList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("number_khong", "Số Không", "Zero", "number_vn_khong", "number_eng_khong"));
        learnObjectList.add(new LearnObject("number_mot", "Số Một", "One", "number_vn_mot", "number_eng_mot"));
        learnObjectList.add(new LearnObject("number_hai", "Số Hai", "Two", "number_vn_hai", "number_eng_hai"));
        learnObjectList.add(new LearnObject("number_ba", "Số Ba", "Three", "number_vn_ba", "number_eng_ba"));
        learnObjectList.add(new LearnObject("number_bon", "Số Bốn", "Four", "number_vn_bon", "number_eng_bon"));
        learnObjectList.add(new LearnObject("number_nam", "Số Năm", "Five", "number_vn_nam", "number_eng_nam"));
        learnObjectList.add(new LearnObject("number_sau", "Số Sáu", "Six", "number_vn_sau", "number_eng_sau"));
        learnObjectList.add(new LearnObject("number_bay", "Số Bảy", "Seven", "number_vn_bay", "number_eng_bay"));
        learnObjectList.add(new LearnObject("number_tam", "Số Tám", "Eight", "number_vn_tam", "number_eng_tam"));
        learnObjectList.add(new LearnObject("number_chin", "Số Chín", "Nine", "number_vn_chin", "number_eng_chin"));
        learnObjectList.add(new LearnObject("number_muoi", "Số Mười", "Ten", "number_vn_muoi", "number_eng_muoi"));

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
        learnObjectList.add(new LearnObject("alphabet_a_1", "", "", "alphabet_vn_a_1", "alphabet_eng_a_1"));
        learnObjectList.add(new LearnObject("alphabet_b", "", "", "alphabet_vn_b", "alphabet_eng_b"));
        learnObjectList.add(new LearnObject("alphabet_c", "", "", "alphabet_vn_c", "alphabet_eng_c"));
        learnObjectList.add(new LearnObject("alphabet_d_1", "", "", "alphabet_vn_d_1", "alphabet_eng_d_1"));
        learnObjectList.add(new LearnObject("alphabet_e_1", "", "", "alphabet_vn_e_1", "alphabet_eng_e_1"));
        learnObjectList.add(new LearnObject("alphabet_g", "", "", "alphabet_vn_g", "alphabet_eng_g"));
        learnObjectList.add(new LearnObject("alphabet_h", "", "", "alphabet_vn_h", "alphabet_eng_h"));
        learnObjectList.add(new LearnObject("alphabet_i", "", "", "alphabet_vn_i", "alphabet_eng_i"));
        learnObjectList.add(new LearnObject("alphabet_j", "", "", "alphabet_vn_j", "alphabet_eng_j"));
        learnObjectList.add(new LearnObject("alphabet_k", "", "", "alphabet_vn_k", "alphabet_eng_k"));
        learnObjectList.add(new LearnObject("alphabet_l", "", "", "alphabet_vn_l", "alphabet_eng_l"));
        learnObjectList.add(new LearnObject("alphabet_m", "", "", "alphabet_vn_m", "alphabet_eng_m"));
        learnObjectList.add(new LearnObject("alphabet_n", "", "", "alphabet_vn_n", "alphabet_eng_n"));
        learnObjectList.add(new LearnObject("alphabet_o_1", "", "", "alphabet_vn_o_1", "alphabet_eng_o_1"));
        learnObjectList.add(new LearnObject("alphabet_p", "", "", "alphabet_vn_p", "alphabet_eng_p"));
        learnObjectList.add(new LearnObject("alphabet_q", "", "", "alphabet_vn_q", "alphabet_eng_q"));
        learnObjectList.add(new LearnObject("alphabet_r", "", "", "alphabet_vn_r", "alphabet_eng_r"));
        learnObjectList.add(new LearnObject("alphabet_s", "", "", "alphabet_vn_s", "alphabet_eng_s"));
        learnObjectList.add(new LearnObject("alphabet_t", "", "", "alphabet_vn_t", "alphabet_eng_t"));
        learnObjectList.add(new LearnObject("alphabet_u_1", "", "", "alphabet_vn_u_1", "alphabet_eng_u_1"));
        learnObjectList.add(new LearnObject("alphabet_v", "", "", "alphabet_vn_v", "alphabet_eng_v"));
        learnObjectList.add(new LearnObject("alphabet_x", "", "", "alphabet_vn_x", "alphabet_eng_x"));
        learnObjectList.add(new LearnObject("alphabet_y", "", "", "alphabet_vn_y", "alphabet_eng_y"));
        learnObjectList.add(new LearnObject("alphabet_w", "", "", "alphabet_vn_w", "alphabet_eng_w"));
        learnObjectList.add(new LearnObject("alphabet_z", "", "", "alphabet_vn_z", "alphabet_eng_z"));


        return learnObjectList;
    }

    public static List<LearnObject> getFruitList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("fruit_quabingo", "Quả Bí Ngô", "Pumpkin", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quatao", "Quả Táo", "Apple", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quacam", "Quả Cam", "Orange", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quachanh", "Quả Chanh", "Lemon", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaoi", "Quả Ổi", "Guava", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quachuoi", "Quả Chuối", "Banana", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaxoai", "Quả Xoài", "Mangoes", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quanho", "Quả Nho", "Grape", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quachomchom", "Quả Chôm Chôm", "Rambutan fruit", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quadua", "Quả Dừa", "Coconut", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaot", "Quả Ớt", "Chili Peppers", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quamit", "Quả Mít", "Jack fruit", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_bapngo", "Bắp Ngô", "Corncob", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quacachua", "Quả Cà Chua", "Tomato", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaduachuot", "Quả Dưa Chuột", "Cucumber", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaduahau", "Quả Dưa Hấu", "Watermelon", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quale", "Quả Lê", "Pear", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quakhe", "Quả Khế", "Starfruit", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_qualuu", "Quả Lựu", "Pomegranate", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quanhan", "Quả Nhãn", "Longan", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quabuoi", "Quả Bưởi", "Grapefruit", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quadudu", "Quả Đu Đủ", "Papaya", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quaman", "Quả Mận", "Plum", "number_one", "number_one"));
        learnObjectList.add(new LearnObject("fruit_quadao", "Quả Đào", "Peaches", "number_one", "number_one"));

        return learnObjectList;
    }

    public static List<LearnObject> getBodyList() {
        learnObjectList = new ArrayList<>();

        return learnObjectList;
    }

    public static List<LearnObject> getColorList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("color_do", "Màu Đỏ", "Red", "color_vn_do", "color_eng_do"));
        learnObjectList.add(new LearnObject("color_den", "Màu Đen", "Black", "color_vn_den", "color_eng_den"));
        learnObjectList.add(new LearnObject("color_trang", "Màu Trắng", "White", "color_vn_trang", "color_eng_trang"));
        learnObjectList.add(new LearnObject("color_vang", "Màu Vàng", "Yellow", "color_vn_vang", "color_eng_vang"));
        learnObjectList.add(new LearnObject("color_tim", "Màu Tím", "Purple", "color_vn_tim", "color_eng_tim"));
        learnObjectList.add(new LearnObject("color_hong", "Màu Hồng", "Pink", "color_vn_hong", "color_eng_hong"));
        learnObjectList.add(new LearnObject("color_dacam", "Màu Da Cam", "Orange", "color_vn_dacam", "color_eng_dacam"));
        learnObjectList.add(new LearnObject("color_nau", "Màu Nâu", "Brown", "color_vn_nau", "color_eng_nau"));
        learnObjectList.add(new LearnObject("color_xam", "Màu Xám", "Grey", "color_vn_xam", "color_eng_xam"));
        learnObjectList.add(new LearnObject("color_xanhlacay", "Màu Xanh Lá Cây", "Green", "color_vn_xanhlacay", "color_eng_xanhlacay"));
        learnObjectList.add(new LearnObject("color_xanhduong", "Màu Xanh Dương", "Blue", "color_vn_xanhduong", "color_eng_xanhduong"));

        return learnObjectList;
    }

    public static List<LearnObject> getShapeList() {
        learnObjectList = new ArrayList<>();

        return learnObjectList;
    }
}
