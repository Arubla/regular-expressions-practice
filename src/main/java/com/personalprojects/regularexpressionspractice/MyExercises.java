package com.personalprojects.regularexpressionspractice;

public class MyExercises {

    //given a string, return a string that removes all non-letter characters and replaces them with spaces.

    public String splitNotLetter(String str) {

        String temp = str.replaceAll("[^a-zA-Z]+", " ");

        return temp;
    }



}
