package main;

import entities.ResultValue;
import services.MathUtility;
import services.StringUtility;

public class Test {

    public static void main(String[] args) {

        // bai 1 - kiem tra doi xung
        String input = "abcba";
        boolean result = StringUtility.IsSymmetry(input);
        if(result)
        {
            System.out.format("Chuoi doi xung");
        }
        else
        {
            System.out.format("Chuoi khong doi xung");
        }

        System.out.format("\n");
        // bai 2 - tinh nghiem phuong trinh bac 2
        int a = 2;
        int b = -7;
        int c = 3;
        ResultValue value = MathUtility.GetOutputQuadraticEquation(a,b,c);

        if(value == null)
        {
            System.out.format(" Phuong trinh vo nghiem");
        }
        else
        {
            System.out.format(" Nghiem cua phuong trinh là:\n");
            System.out.format("Nghiem 1 : %f", value.Value1);
            System.out.format("    ||    ");
            System.out.format("Nghiem 2: %f", value.Value2);
        }

    }

}
