package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_11718 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            if(s != null) {
                System.out.println(s);
            } else {
                break;
            }
        }
    }
}
