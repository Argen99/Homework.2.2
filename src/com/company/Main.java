package com.company;
import java.util.Random;
public class Main {

    public static String randomAge;
    public static void main(String[]args){
    Random randomAge = new Random();
    int x = randomAge.nextInt();
    int y = randomAge.nextInt();
    int z = randomAge.nextInt();
        String result1 = person(x,0);
        System.out.println(result1);
        String result2 = person(y,0);
        System.out.println(result2);
        String result3 = person(z,0);
        System.out.println(result3);
}



    public static String person(int age, int temp) {
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return ("Можно идти гулять");
        } else if ((age < 20) && (temp > 0 && temp < 28)) {
            return ("Можно идти гулять");
        } else if ((age > 45) && (temp > -10 && temp < 25)) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }

    }
}