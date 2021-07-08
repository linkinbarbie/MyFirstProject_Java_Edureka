public class Edureka_Assignment_DataTypes {
    public static void main(String[] args) {
        //integer

        int intNumber = 200;
        System.out.println("int primitive type is:" + intNumber);

        //short
        short shtNumber = 5995;
        System.out.println("short primitive type is:" + shtNumber);

        //long
        long lngNumber = 8889899;
        System.out.println("long primitive type is:" + lngNumber);

        //byte - 113
        byte byNumber = 100;
        System.out.println("byte primitive type is:" + byNumber);

        //float - 7 decimal places
        float flNumber = 7.87676767767f;//will shorten to 7 decimal places
        System.out.println("float primitive type is:" + flNumber);

        //double - 15 decimal places
        double dblNumber = 7.89999999d;
        System.out.println("double primitive type is:" + dblNumber);

        //char holds characters 2 bytes
        char chrType = 'B';
        System.out.println("char primitive type is:" + chrType);

        //bool holds logical(true or false)
        boolean bolType = true;
        System.out.println(bolType);//can be true because the variable is assigned to true

        Integer IntNumber = 23232;
        System.out.println(IntNumber);

        Float FlNumber = 45.56554554f;
        System.out.println(FlNumber);

        Character CrType = 'L';
        System.out.println(CrType);

        Boolean BlType = true;
        System.out.println(BlType);

       //Using Operators
        //Addition
       int addResult = intNumber + intNumber;
        System.out.println("Addition Operator creates this:" + addResult);
       //Subtraction
       long subResult = lngNumber - shtNumber;
        System.out.println("Subtract Operator creates this:" + subResult);

        //multiplication
       double mulResult = dblNumber * dblNumber;
        System.out.println("Multiplication Operator creates this:" + mulResult);

        //division
       double divResult = dblNumber / dblNumber;
       System.out.println("Division Operator creates this:" + divResult);

       //increment
       int incResult = ++intNumber;//use this to increase by 1
       System.out.println("Incremental Operator creates this:" + incResult);

       //decrement
       long decResult = --byNumber;//use this to decrease by 1
       System.out.println("Decremental Operator creates this:"+  decResult);



    }
}
