package com.company;


public class Main {

    public static void main(String[] args) {
//        int test= gcd(30,10);
        double test=sqrt(3.14);
        System.out.println(test);

    }


    //递归实现最大公约数
    private static int gcd(int p,int q){
        if(q==0){
            return p;
        }
        int r=p%q;
        return gcd(q,r);
    }
    //牛顿法求平方根
    private static double sqrt(double c){
        if(c<0){
            return Double.NaN;
        }
        double err=1e-15;
        double t=c;
        //todo 迭代求近似值
        while (Math.abs(t-c/t)>err*t){
            t=(c/t+t)/2.0;
        }
        return t;
    }
}
