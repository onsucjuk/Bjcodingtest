package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_hashmap3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값:");
        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s,",");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; st.hasMoreTokens(); i++){
            list.add(Integer.parseInt(st.nextToken()));
        }


    }
}
