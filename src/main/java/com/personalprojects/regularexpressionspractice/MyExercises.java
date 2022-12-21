package com.personalprojects.regularexpressionspractice;

public class MyExercises {

    //1. Given a string, return a string that removes all non-letter characters and replaces them with spaces.

    public String splitNotLetter(String str) {

        return str.replaceAll("[^a-zA-Z]+", " ");

    }

    //2. Given a credit card number as a string, return a string that eliminates all special characters
    // that might be dividing the numbers.

    public String normalizeNum(String str) {
        return str.replaceAll("[^0-9]", "");
    }

    //3. Given a credit card number as a string, return a string that replaces the first 12 digits with "X"
    //and changes all special characters to "-"

    public String maskNum(String cc) {
        return cc.replaceAll("[^0-9]", "-").replaceAll("\\d{4}-\\d{4}-\\d{4}", "XXXX-XXXX-XXXX");

    }

    public static void main(String[] args) {
        MyExercises myExercises = new MyExercises();
        System.out.println(myExercises.maskNum("1234!5678-9012-3456"));
    }


}
