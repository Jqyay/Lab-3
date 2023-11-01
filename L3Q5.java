/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args){
        System.out.println("ax + by = c, cx + dy = f ;\nx = (ed - bf)/(ad - bc), y = (af-ec)/(ad - bc)");
        double x, y;
        double[] input = new double[6];
        String [] inputName = {"a", "b", "c","d","e","f"};
        for (int i =0; i<6; i++){
            input[i]= getValue(inputName[i]);
        }
        if (((input[0]*input[3])-(input[1]*input[2]))!=0){
            x = ((input[4]*input[3])-(input[1]*input[5]))/((input[0]*input[3])-(input[1]*input[2]));
            y = ((input[0]*input[5])-(input[4]*input[2]))/((input[0]*input[3])-(input[1]*input[2]));
            System.out.format("x = %.2f%ny = %.2f",x ,y);
        }
        else 
            System.out.println("The equation has no solution.");
    }
    public static double getValue(String a){
            Scanner sc = new Scanner(System.in);
            System.out.format("%s = ", a);
            double i = sc.nextDouble();
            return i;
        }
}
