package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        String w = "Привет группа 132";
        System.out.println(w.toUpperCase());
        System.out.println(w.length());
        char[] s = w.toCharArray();
        for(int i = 0; i < s.length; i++) {
            System.out.print(Character.toUpperCase(s[i])+" ");
        }
    }
}
