package com.ironhack.ej1;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {29,7,27,4,10};
        int dif = difference(intArray);
        System.out.println(dif);

        int num1 = 1;
        int num2 = 5;
        double result = result(num1,num2);
        System.out.println(result);

        int[] numb = {1,-5,5,-17,12};
        smallest(numb);


    }
    public static int difference(int[] intArray){
        int largest = 0;
        int smallest = 1;
        for(int i=0;i<intArray.length;i++){
            if(intArray[i] < smallest){
                smallest = intArray[i];
            } else if (intArray[i]>largest) {
                largest = intArray[i];
            }
        }
        return (largest - smallest);
    }

    public static double result(int x,int y){
        return ((Math.pow(x,2))+(Math.pow((((4*y)/5)-x),2)));
    }

    public static void smallest(int [] numArray){
        int small1 = 0;
        int small2 = 0;
        for(int i=0;i<numArray.length;i++){
            if(numArray[i] < small1){
                small1 = numArray[i];
                small2 = small1;
            } else if (numArray[i] < small2) {
                small2 = numArray[i];
            }
        }
        System.out.println("the smallest numbers are "+ small1 + " and " + small2);
    }
}
