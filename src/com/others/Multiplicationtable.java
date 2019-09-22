package com.others;

public class Multiplicationtable {
    /**
     * 99乘法表输出
     */
    public void print(){
        for(int i = 1; i < 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + j*i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
