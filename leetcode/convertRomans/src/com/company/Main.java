package com.company;
import java.util.HashMap;


//
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
//
//        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//        Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.



public class Main {

    public static void main(String[] args) {

        romanToInt("MCMXCIV");

    }

    public static int romanToInt(String s) {



        //place items in map
        HashMap<Character, Integer> roman = new HashMap<Character, Integer> ();

        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int n = s.length() -1;//edge-prevent out of bounds error
        char[] ch = s.toCharArray();
        int number = 0;
        for(int i = 0; i < n; i++){//loop through char array
            int x =roman.get(ch[i]);//set curr index and next
            int y =roman.get(ch[i+1]);
            if(x >= y){ number += x;}else{number -= x;};//either add or subtract depending on trailing char

        }
        number += roman.get(ch[n]);//add last digit

        return number;
    }


}
