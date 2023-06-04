package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex_hashmap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값 : ");
        String s = sc.nextLine();
        sc.close();
        StringTokenizer st = new StringTokenizer(s,",");
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; st.hasMoreTokens(); i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        System.out.print("저장된 값 : ");
        for(Integer rset : set){
            if(rset < set.size()){
                System.out.print(rset + ",");
            } else {
                System.out.println(rset);
            }
        }

        System.out.print("출력 메세지 : 저장된 값은 ");
        for(Integer rset : set){
            if(rset < set.size()){
                System.out.print(rset + ",");
            } else {
                System.out.print(rset);
            }
        }
        System.out.println("입니다.");
    }
}
