package com.company;

public class Square {
    double x;
    public double square(int rad){
        double s= 3.14*rad*rad;
        return s;
    }
    public double square(int rad,boolean q){
        if(q=true){
          x=3.14*4*rad*rad/4;
        } else if(q=false){
            x=3.14*rad*rad;
        }
        return x;
    }
}
