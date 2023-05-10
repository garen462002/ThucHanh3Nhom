/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3;

/**
 *
 * @author Tam Tue
 */
public class quydoi {
    String quyDoi4(double DiemHeSo10){
        if(DiemHeSo10<=10 && DiemHeSo10>=9.5)
            return "Giỏi A+ (4.0)";
        else if(DiemHeSo10<=9.4 && DiemHeSo10>=8.5)
            return "Giỏi A (4.0)";
        else if(DiemHeSo10<=8.4 && DiemHeSo10>=8.0)
            return "Khá A- (3.65)";
        else if(DiemHeSo10<=7.9 && DiemHeSo10>=7.5)
            return "Khá B+ (3.33)";
        else if(DiemHeSo10<=7.4 && DiemHeSo10>=7.0)
            return "Khá B (3.0)";
        else if(DiemHeSo10<=6.9 && DiemHeSo10>=6.5)
            return "Trung Bình B- (2.65)";
        else if(DiemHeSo10<=6.4 && DiemHeSo10>=6.0)
            return "Trung Bình C+ (2.33)";
        else if(DiemHeSo10<=5.9 && DiemHeSo10>=5.5)
            return "Trung Bình C (2.0)";
        else if(DiemHeSo10<=5.4 && DiemHeSo10>=4.5)
            return "Trung Bình Yếu C- (1.65)";
        else if(DiemHeSo10<=4.4 && DiemHeSo10>=4.0)
            return "Trung Bình Yếu D (1.0)";
        else 
            return "Kém F (0.0)";
    }
}
