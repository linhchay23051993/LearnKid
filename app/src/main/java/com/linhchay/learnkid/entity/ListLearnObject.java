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
        learnObjectList.add(new LearnObject("animals_conho", "Con Hổ", "Tiger", "animals_vn_conho", "animals_eng_conho"));
        learnObjectList.add(new LearnObject("animals_consutu", "Con Sư Tử", "Lion", "animals_vn_consutu", "animals_eng_consutu"));
        learnObjectList.add(new LearnObject("animals_convoi", "Con Voi", "Elephant", "animals_vn_convoi", "animals_eng_convoi"));
        learnObjectList.add(new LearnObject("animals_conkhi", "Con Khỉ", "Monkey", "animals_vn_conkhi", "animals_eng_conkhi"));
        learnObjectList.add(new LearnObject("animals_concho", "Con Chó", "Dog", "animals_vn_concho", "animals_eng_concho"));
        learnObjectList.add(new LearnObject("animals_conhuoucaoco", "Hươu Cao Cổ", "Giraffe", "animals_vn_conhuoucaoco", "animals_eng_conhuoucaoco"));
        learnObjectList.add(new LearnObject("animals_conmeo", "Con Mèo", "Cat", "animals_vn_conmeo", "animals_eng_conmeo"));
        learnObjectList.add(new LearnObject("animals_conga", "Con Gà", "Chicken", "animals_vn_conga", "animals_eng_conga"));
        learnObjectList.add(new LearnObject("animals_conbo", "Con Bò", "Cows", "animals_vn_conbo", "animals_eng_conbo"));
        learnObjectList.add(new LearnObject("animals_conlon", "Con Lợn", "Pig", "animals_vn_conlon", "animals_eng_conlon"));
        learnObjectList.add(new LearnObject("animals_contrau", "Con Trâu", "Buffalo", "animals_vn_contrau", "animals_eng_contrau"));
        learnObjectList.add(new LearnObject("animals_convit", "Con Vịt", "Duck", "animals_vn_convit", "animals_eng_convit"));
        learnObjectList.add(new LearnObject("animals_conchim", "Con Chim Bồ Câu", "Pigeon", "animals_vn_conchimbocau", "animals_eng_conchimbocau"));
        learnObjectList.add(new LearnObject("animals_conkien", "Con Kiến", "Ant", "animals_vn_conkien", "animals_eng_conkien"));
        learnObjectList.add(new LearnObject("animals_conmuoi", "Con Muỗi", "Mosquito", "animals_vn_conmuoi", "animals_eng_conmuoi"));
        learnObjectList.add(new LearnObject("animals_conech", "Con Ếch", "Frog", "animals_vn_conech", "animals_eng_conech"));
        learnObjectList.add(new LearnObject("animals_conde", "Con Dê", "Goat", "animals_vn_conde", "animals_eng_conde"));
        learnObjectList.add(new LearnObject("animals_conca", "Con Cá", "Fish", "animals_vn_conca", "animals_eng_conca"));
        learnObjectList.add(new LearnObject("animals_concaheo", "Con Cá Heo", "Dolphin", "animals_vn_concaheo", "animals_eng_concaheo"));
        learnObjectList.add(new LearnObject("animals_congau", "Con Gấu", "Bear", "animals_vn_congau", "animals_eng_congau"));
        learnObjectList.add(new LearnObject("animals_conbosua", "Con Bò sữa", "Milk cow", "animals_vn_conbosua", "animals_eng_conbosua"));
        learnObjectList.add(new LearnObject("animals_conchuot", "Con Chuột", "Mouse", "animals_vn_conchuot", "animals_eng_conchuot"));
        learnObjectList.add(new LearnObject("animals_concua", "Con Cua", "Crab", "animals_vn_concua", "animals_eng_concua"));
        learnObjectList.add(new LearnObject("animals_contho", "Con Thỏ", "Rabbit", "animals_vn_contho", "animals_eng_contho"));
        learnObjectList.add(new LearnObject("animals_concasau", "Con Cá Sấu", "Crocodile", "animals_vn_concasau", "animals_eng_concasau"));
        learnObjectList.add(new LearnObject("animals_congautruc", "Con Gấu Trúc", "Panda", "animals_vn_congautruc", "animals_eng_congautruc"));
        learnObjectList.add(new LearnObject("animals_conlacda", "Con Lạc Đà", "Camel", "animals_vn_conlacda", "animals_eng_conlacda"));
        learnObjectList.add(new LearnObject("animals_contegiac", "Con Tê Giác", "Rhino", "animals_vn_contegiac", "animals_eng_contegiac"));
        learnObjectList.add(new LearnObject("animals_conhama", "Con Hà Mã", "Hippopotamus", "animals_vn_conhama", "animals_eng_conhama"));
        learnObjectList.add(new LearnObject("animals_conngua", "Con Ngựa", "Horse", "animals_vn_conngua", "animals_eng_conngua"));
        return learnObjectList;
    }

    public static List<LearnObject> getObjectList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("object_quabong", "Quả Bóng", "Ball", "object_vn_quabong", "object_eng_quabong"));
        learnObjectList.add(new LearnObject("object_caiban", "Cái Bàn", "Table", "object_vn_caiban", "object_eng_caiban"));
        learnObjectList.add(new LearnObject("object_caighe", "Cái Ghế", "Chair", "object_vn_caighe", "object_eng_caighe"));
        learnObjectList.add(new LearnObject("object_caitivi", "Cái Tivi", "The television", "object_vn_caitivi", "object_eng_caitivi"));
        learnObjectList.add(new LearnObject("object_xemay", "Xe Máy", "Motorbike", "object_vn_xemay", "object_eng_xemay"));
        learnObjectList.add(new LearnObject("object_xedap", "Xe Đạp", "Bike", "object_vn_xedap", "object_eng_xedap"));
        learnObjectList.add(new LearnObject("object_oto", "Ô Tô", "Car", "object_vn_oto", "object_eng_oto"));
        learnObjectList.add(new LearnObject("object_maybay", "Máy Bay", "Planes", "object_vn_maybay", "object_eng_maybay"));
        learnObjectList.add(new LearnObject("object_butchi", "Bút Chì", "Pencil", "object_vn_butchi", "object_eng_butchi"));
        learnObjectList.add(new LearnObject("object_quyensach", "Quyển Sách", "Book", "object_vn_quyensach", "object_eng_quyensach"));
        learnObjectList.add(new LearnObject("object_capsach", "Cặp Sách", "Bag", "object_vn_capsach", "object_eng_capsach"));
        learnObjectList.add(new LearnObject("object_dienthoai", "Điện Thoại", "Phone", "object_vn_dienthoai", "object_eng_dienthoai"));
        learnObjectList.add(new LearnObject("object_tulanh", "Tủ Lạnh", "Fridge", "object_vn_tulanh", "object_eng_tulanh"));
        learnObjectList.add(new LearnObject("object_cailuoc", "Cái Lược", "Comb", "object_vn_cailuoc", "object_eng_cailuoc"));
        learnObjectList.add(new LearnObject("object_doigiay", "Đôi Giày", "Shoes", "object_vn_doigiay", "object_eng_doigiay"));
        learnObjectList.add(new LearnObject("object_caio", "Cái Ô", "Umbrella", "object_vn_caio", "object_eng_caio"));
        learnObjectList.add(new LearnObject("object_caikeo", "Cái Kéo", "Scissors", "object_vn_caikeo", "object_eng_caikeo"));
        learnObjectList.add(new LearnObject("object_caiquat", "Cái Quạt", "Fan", "object_vn_caiquat", "object_eng_caiquat"));
        learnObjectList.add(new LearnObject("object_caicoc", "Cái Cốc", "Cup", "object_vn_caicoc", "object_eng_caicoc"));
        learnObjectList.add(new LearnObject("object_caimu", "Cái Mũ", "Hat", "object_vn_caimu", "object_eng_caimu"));
        learnObjectList.add(new LearnObject("object_bongden", "Bóng đèn", "Light bulb", "object_vn_bongden", "object_eng_bongden"));
        learnObjectList.add(new LearnObject("object_caigoi", "Cái Gối", "Pillow", "object_vn_caigoi", "object_eng_caigoi"));
        learnObjectList.add(new LearnObject("object_dongho", "Đồng Hồ", "Clock", "object_vn_dongho", "object_eng_dongho"));
        learnObjectList.add(new LearnObject("object_caichoi", "Cái Chổi", "Broom", "object_vn_caichoi", "object_eng_caichoi"));
        learnObjectList.add(new LearnObject("object_caigiuong", "Cái Giường", "Bed", "object_vn_caigiuong", "object_eng_caigiuong"));
        learnObjectList.add(new LearnObject("object_bongbay", "Bóng Bay", "Balloon", "object_vn_quabongbay", "object_eng_quabongbay"));


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
        learnObjectList.add(new LearnObject("alphabet_a_1", "Aa", "", "alphabet_vn_a_1", "alphabet_eng_a_1"));
        learnObjectList.add(new LearnObject("alphabet_a_2", "Ăă", "", "alphabet_vn_a_2", "alphabet_eng_a_2"));
        learnObjectList.add(new LearnObject("alphabet_a_3", "Ââ", "", "alphabet_vn_a_3", "alphabet_eng_a_3"));
        learnObjectList.add(new LearnObject("alphabet_b", "Bb", "", "alphabet_vn_b", "alphabet_eng_b"));
        learnObjectList.add(new LearnObject("alphabet_c", "Cc", "", "alphabet_vn_c", "alphabet_eng_c"));
        learnObjectList.add(new LearnObject("alphabet_d_1", "Dd", "", "alphabet_vn_d_1", "alphabet_eng_d_1"));
        learnObjectList.add(new LearnObject("alphabet_d_2", "Đđ", "", "alphabet_vn_d_2", "alphabet_eng_d_2"));
        learnObjectList.add(new LearnObject("alphabet_e_1", "Ee", "", "alphabet_vn_e_1", "alphabet_eng_e_1"));
        learnObjectList.add(new LearnObject("alphabet_e_2", "Êê", "", "alphabet_vn_e_2", "alphabet_eng_e_2"));
        learnObjectList.add(new LearnObject("alphabet_g", "Gg", "", "alphabet_vn_g", "alphabet_eng_g"));
        learnObjectList.add(new LearnObject("alphabet_h", "Hh", "", "alphabet_vn_h", "alphabet_eng_h"));
        learnObjectList.add(new LearnObject("alphabet_i", "Ii", "", "alphabet_vn_i", "alphabet_eng_i"));
        learnObjectList.add(new LearnObject("alphabet_k", "Kk", "", "alphabet_vn_k", "alphabet_eng_k"));
        learnObjectList.add(new LearnObject("alphabet_l", "Ll", "", "alphabet_vn_l", "alphabet_eng_l"));
        learnObjectList.add(new LearnObject("alphabet_m", "Mm", "", "alphabet_vn_m", "alphabet_eng_m"));
        learnObjectList.add(new LearnObject("alphabet_n", "Nn", "", "alphabet_vn_n", "alphabet_eng_n"));
        learnObjectList.add(new LearnObject("alphabet_o_1", "Oo", "", "alphabet_vn_o_1", "alphabet_eng_o_1"));
        learnObjectList.add(new LearnObject("alphabet_o_2", "Ôô", "", "alphabet_vn_o_2", "alphabet_eng_o_2"));
        learnObjectList.add(new LearnObject("alphabet_o_3", "Ơơ", "", "alphabet_vn_o_3", "alphabet_eng_o_3"));
        learnObjectList.add(new LearnObject("alphabet_p", "Pp", "", "alphabet_vn_p", "alphabet_eng_p"));
        learnObjectList.add(new LearnObject("alphabet_q", "Qq", "", "alphabet_vn_q", "alphabet_eng_q"));
        learnObjectList.add(new LearnObject("alphabet_r", "Rr", "", "alphabet_vn_r", "alphabet_eng_r"));
        learnObjectList.add(new LearnObject("alphabet_s", "Ss", "", "alphabet_vn_s", "alphabet_eng_s"));
        learnObjectList.add(new LearnObject("alphabet_t", "Tt", "", "alphabet_vn_t", "alphabet_eng_t"));
        learnObjectList.add(new LearnObject("alphabet_u_1", "Uu", "", "alphabet_vn_u_1", "alphabet_eng_u_1"));
        learnObjectList.add(new LearnObject("alphabet_u_2", "Ưư", "", "alphabet_vn_u_2", "alphabet_eng_u_2"));
        learnObjectList.add(new LearnObject("alphabet_v", "Vv", "", "alphabet_vn_v", "alphabet_eng_v"));
        learnObjectList.add(new LearnObject("alphabet_x", "Xx", "", "alphabet_vn_x", "alphabet_eng_x"));
        learnObjectList.add(new LearnObject("alphabet_y", "Yy", "", "alphabet_vn_y", "alphabet_eng_y"));
        return learnObjectList;
    }

    public static List<LearnObject> getAlphabetListENG() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("alphabet_a_1", "", "Aa", "alphabet_vn_a_1", "alphabet_eng_a_1"));
        learnObjectList.add(new LearnObject("alphabet_b", "", "Bb", "alphabet_vn_b", "alphabet_eng_b"));
        learnObjectList.add(new LearnObject("alphabet_c", "", "Cc", "alphabet_vn_c", "alphabet_eng_c"));
        learnObjectList.add(new LearnObject("alphabet_d_1", "", "Dd", "alphabet_vn_d_1", "alphabet_eng_d_1"));
        learnObjectList.add(new LearnObject("alphabet_e_1", "", "Ee", "alphabet_vn_e_1", "alphabet_eng_e_1"));
        learnObjectList.add(new LearnObject("alphabet_f", "", "Ff", "alphabet_vn_f", "alphabet_eng_f"));
        learnObjectList.add(new LearnObject("alphabet_g", "", "Gg", "alphabet_vn_g", "alphabet_eng_g"));
        learnObjectList.add(new LearnObject("alphabet_h", "", "Hh", "alphabet_vn_h", "alphabet_eng_h"));
        learnObjectList.add(new LearnObject("alphabet_i", "", "Ii", "alphabet_vn_i", "alphabet_eng_i"));
        learnObjectList.add(new LearnObject("alphabet_j", "", "Jj", "alphabet_vn_j", "alphabet_eng_j"));
        learnObjectList.add(new LearnObject("alphabet_k", "", "Kk", "alphabet_vn_k", "alphabet_eng_k"));
        learnObjectList.add(new LearnObject("alphabet_l", "", "Ll", "alphabet_vn_l", "alphabet_eng_l"));
        learnObjectList.add(new LearnObject("alphabet_m", "", "Mm", "alphabet_vn_m", "alphabet_eng_m"));
        learnObjectList.add(new LearnObject("alphabet_n", "", "Nn", "alphabet_vn_n", "alphabet_eng_n"));
        learnObjectList.add(new LearnObject("alphabet_o_1", "", "Oo", "alphabet_vn_o_1", "alphabet_eng_o_1"));
        learnObjectList.add(new LearnObject("alphabet_p", "", "Pp", "alphabet_vn_p", "alphabet_eng_p"));
        learnObjectList.add(new LearnObject("alphabet_q", "", "Qq", "alphabet_vn_q", "alphabet_eng_q"));
        learnObjectList.add(new LearnObject("alphabet_r", "", "Rr", "alphabet_vn_r", "alphabet_eng_r"));
        learnObjectList.add(new LearnObject("alphabet_s", "", "Ss", "alphabet_vn_s", "alphabet_eng_s"));
        learnObjectList.add(new LearnObject("alphabet_t", "", "Tt", "alphabet_vn_t", "alphabet_eng_t"));
        learnObjectList.add(new LearnObject("alphabet_u_1", "", "Uu", "alphabet_vn_u_1", "alphabet_eng_u_1"));
        learnObjectList.add(new LearnObject("alphabet_v", "", "Vv", "alphabet_vn_v", "alphabet_eng_v"));
        learnObjectList.add(new LearnObject("alphabet_x", "", "Xx", "alphabet_vn_x", "alphabet_eng_x"));
        learnObjectList.add(new LearnObject("alphabet_y", "", "Yy", "alphabet_vn_y", "alphabet_eng_y"));
        learnObjectList.add(new LearnObject("alphabet_w", "", "Ww", "alphabet_vn_w", "alphabet_eng_w"));
        learnObjectList.add(new LearnObject("alphabet_z", "", "Zz", "alphabet_vn_z", "alphabet_eng_z"));

        return learnObjectList;
    }

    public static List<LearnObject> getFruitList() {
        learnObjectList = new ArrayList<>();
        learnObjectList.add(new LearnObject("fruit_quabingo", "Quả Bí Ngô", "Pumpkin", "fruit_vn_quabingo", "fruit_eng_quabingo"));
        learnObjectList.add(new LearnObject("fruit_quatao", "Quả Táo", "Apple", "fruit_vn_quatao", "fruit_eng_quatao"));
        learnObjectList.add(new LearnObject("fruit_quacam", "Quả Cam", "Orange", "fruit_vn_quacam", "fruit_eng_quacam"));
        learnObjectList.add(new LearnObject("fruit_quachanh", "Quả Chanh", "Lemon", "fruit_vn_quachanh", "fruit_eng_quachanh"));
        learnObjectList.add(new LearnObject("fruit_quaoi", "Quả Ổi", "Guava", "fruit_vn_quaoi", "fruit_eng_quaoi"));
        learnObjectList.add(new LearnObject("fruit_quachuoi", "Quả Chuối", "Banana", "fruit_vn_quachuoi", "fruit_eng_quachuoi"));
        learnObjectList.add(new LearnObject("fruit_quaxoai", "Quả Xoài", "Mangoes", "fruit_vn_quaxoai", "fruit_eng_quaxoai"));
        learnObjectList.add(new LearnObject("fruit_quanho", "Quả Nho", "Grape", "fruit_vn_quanho", "fruit_eng_quanho"));
        learnObjectList.add(new LearnObject("fruit_quachomchom", "Quả Chôm Chôm", "Rambutan", "fruit_vn_quachomchom", "fruit_eng_quachomchom"));
        learnObjectList.add(new LearnObject("fruit_quadua", "Quả Dừa", "Coconut", "fruit_vn_quadua", "fruit_eng_quadua"));
        learnObjectList.add(new LearnObject("fruit_quaot", "Quả Ớt", "Chili Peppers", "fruit_vn_quaot", "fruit_eng_quaot"));
        learnObjectList.add(new LearnObject("fruit_quamit", "Quả Mít", "Jackfruit", "fruit_vn_quamit", "fruit_eng_quamit"));
        learnObjectList.add(new LearnObject("fruit_bapngo", "Bắp Ngô", "Corncob", "fruit_vn_bapngo", "fruit_eng_bapngo"));
        learnObjectList.add(new LearnObject("fruit_quacachua", "Quả Cà Chua", "Tomato", "fruit_vn_quacachua", "fruit_eng_quacachua"));
        learnObjectList.add(new LearnObject("fruit_quaduachuot", "Quả Dưa Chuột", "Cucumber", "fruit_vn_quaduachuot", "fruit_eng_quaduachuot"));
        learnObjectList.add(new LearnObject("fruit_quaduahau", "Quả Dưa Hấu", "Watermelon", "fruit_vn_quaduahau", "fruit_eng_quaduahau"));
        learnObjectList.add(new LearnObject("fruit_quale", "Quả Lê", "Pear", "fruit_vn_quale", "fruit_eng_quale"));
        learnObjectList.add(new LearnObject("fruit_quakhe", "Quả Khế", "Starfruit", "fruit_vn_quakhe", "fruit_eng_quakhe"));
        learnObjectList.add(new LearnObject("fruit_qualuu", "Quả Lựu", "Pomegranate", "fruit_vn_qualuu", "fruit_eng_qualuu"));
        learnObjectList.add(new LearnObject("fruit_quanhan", "Quả Nhãn", "Logan", "fruit_vn_quanhan", "fruit_eng_quanhan"));
        learnObjectList.add(new LearnObject("fruit_quabuoi", "Quả Bưởi", "Grape", "fruit_vn_quabuoi", "fruit_eng_quabuoi"));
        learnObjectList.add(new LearnObject("fruit_quadudu", "Quả Đu Đủ", "Papaya", "fruit_vn_quadudu", "fruit_eng_quadudu"));
        learnObjectList.add(new LearnObject("fruit_quaman", "Quả Mận", "Plum", "fruit_vn_quaman", "fruit_eng_quaman"));
        learnObjectList.add(new LearnObject("fruit_quadao", "Quả Đào", "Peaches", "fruit_vn_quadao", "fruit_eng_quadao"));

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

    public static List<LearnObject> getBodyList() {
        learnObjectList = new ArrayList<>();

        return learnObjectList;
    }

    public static List<LearnObject> getShapeList() {
        learnObjectList = new ArrayList<>();

        return learnObjectList;
    }
}
