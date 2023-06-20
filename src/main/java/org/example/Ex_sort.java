package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 5; i++) {
                set.add(sc.nextInt());
        }

        for(Integer setnum : set){
            System.out.print(setnum+" ");
        }
    }
}
