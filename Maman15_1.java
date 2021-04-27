package com.company;

public class Main {

    public static boolean contains(String str, char ch){
        int index = -1;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                index = i;
        }

        return index != -1;
    }

    public static boolean daughter(String s1, String s2) {

        if( s2.length() == 1 ) {
            return contains(s1, s2.charAt(0));
        }

        return daughter(s1, s2.substring(1));
    }

    public static void main(String[] args) {

        boolean q0res = daughter("Java", "Jvd");
    }


}
