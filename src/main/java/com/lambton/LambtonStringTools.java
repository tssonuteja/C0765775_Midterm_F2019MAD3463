package com.lambton;

public class LambtonStringTools {

public static String reverse(String s) {

       StringBuilder st=new StringBuilder(s);
        st.reverse();

        return st.toString();
}

    public static int binaryToDecimal(int binary){
        int decimal=0;
        int p = 0;
        while(true){
            if(binary==0){
                break;
            }
        else{
                int temp = binary%10;
                decimal += temp*Math.pow(2, p);
                binary = binary/10;
                p++;
            }


        }

        return decimal;
    }










}
