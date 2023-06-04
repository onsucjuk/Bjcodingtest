package org.example;

import java.util.*;

public class Ex_hashmap {
    public static void main(String[] args){

        System.out.print("입력값 : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s,",");

        HashSet<Integer> map = new HashSet<>();

        for(int i = 0; st.hasMoreTokens(); i++){
            map.add(Integer.parseInt(st.nextToken()));
        }

        System.out.print("출력값 : ");
        for(int rmap : map){
            if(rmap<map.size()){
                System.out.print(rmap+",");
            } else{
                System.out.print(rmap);
            }
        }

    }
}
