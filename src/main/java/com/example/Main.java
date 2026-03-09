/*
* File: Main.java
* Author: Erős István
* Copyright: 2026, Erős István
* Group: Szoft I-N
* Date: 2026-03-09
* Github: https://github.com/eros12345/
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Települések tárolása...");
        List<String> cityList = Solution.task01();
        Solution.printCities(cityList);
    }
}