package main;

import entities.ResultValue;
import services.MathUtility;
import services.StringUtility;

public class Test {

    public static void main(String[] args) {

        // bai 1 - kiem tra doi xung
        String input = "123456";
        boolean result = StringUtility.IsSymmetry(input);
        if(result)
        {
            System.out.format("Chuoi doi xung");
        }
        else
        {
            System.out.format("Chuoi khong doi xung");
        }

        // bai 2 - tinh nghiem phuong trinh bac 2
        int a = 1;
        int b = 3;
        int c = 2;
        ResultValue value = MathUtility.GetOutputQuadraticEquation(a,b,c);

        if(value == null)
        {
            System.out.format("Phuong trinh vo nghiem");
        }
        else
        {
            System.out.format("Nghiem cua phuong trinh là:");
            System.out.format("Nghiem 1 : %d", value.Value1);
            System.out.format("Nghiem 2: %d", value.Value2);
        }

    }

}
