package com.companyOP;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String Number = sc.next();
        int[] numbersList = new int[Number.length()];
        for (int i = 0; i < Number.length(); i++) {
            numbersList[i] = Integer.parseInt(Number.charAt(i) + "");
        }
//        out:for (int i = numbersList.length - 1; i > -1; i--) {
//            in:for (int j = i; j > -1; j--) {
//                if (numbersList[i] > numbersList[j]&&numbersList[i]!=numbersList[i-1]) {
//                    int temp = numbersList[i];
//                    numbersList[i] = numbersList[j];
//                    numbersList[j] = temp;
//                    movied=true;
//                   // break out;
//                }
//            }
//        }
        int Temp=0,moreThanTemp=Integer.parseInt(Number);
        boolean firstTime=true,secound=false;
        LinkedList<Integer> lis=new LinkedList<Integer>();
        for(int y=0;y<Number.length();y++)
        {
            out:for (int i = 0; i <numbersList.length; i++) {
                in:for (int j = 0; j <numbersList.length; j++) {
                    {
                        int temp = numbersList[i];
                        numbersList[i] = numbersList[j];
                        numbersList[j] = temp;
                        Temp=0;

                        for (int a : numbersList) {
                            Temp+=a;
                            Temp*=10;
                        }
                        Temp/=10;
                        lis.add(Temp);
                        if (secound&&Temp>Integer.parseInt(Number))
                        {
                            secound=false;
                            moreThanTemp=Temp;
                        }
                        if (firstTime)
                        {
                            firstTime=false;
                            secound=true;
                        }
                        if(Temp<moreThanTemp&&Temp>Integer.parseInt(Number)&&Temp!=Integer.parseInt(Number))
                        {
                            moreThanTemp=Temp;
                        }

                        // break out;

                    }
//                for (int k = 0; k < Number.length(); k++) {
//                    numbersList[k] = Integer.parseInt(Number.charAt(k) + "");
//                }

                }
            }
        }
        if(moreThanTemp!=Integer.parseInt(Number))
        {

            System.out.println(moreThanTemp);
        }
        else
            System.out.println(0);

    }
}
