package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Települések tárolása...");
        List<String> cityList = Solution.task01();
        Solution.printCities(cityList);
    }
}