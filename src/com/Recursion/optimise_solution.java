package com.Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class optimise_solution {
    public static void main(String[] args) {
        factors(12);

    }

    public static void factors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i + " ");
                    arr.add(n / i);
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}

/*
 */
