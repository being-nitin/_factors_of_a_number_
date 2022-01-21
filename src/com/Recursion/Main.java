package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Factors of a number:
	 */
     int n=12;
     factors(n);

    }
    public static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}

