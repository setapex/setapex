package com.company;
public class Return {
    static String retur(int n){
        if (n == 1) return String.valueOf(n);
        else return n+" "+retur(n-1);
    }

}
