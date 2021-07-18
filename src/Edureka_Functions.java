public class Edureka_Functions {
    public static void main(String[] args) {
        System.out.println("Testing this logic with int " + intArea(2, 4));
        System.out.println("Testing this logic with double " + dblArea(2.3d, 3.2d, 5.4d));
        int d = 9;
        Increase(d);//this will not work because you did not create a mechanism to call the parameter in the main function - the class / function is void
        System.out.println("Testing Call By Value: " + d);


    }

    public static int intArea(int a, int b) {//setting up a function/method- this function is public in scope, static-class instance does not need to be defined, return type is int

        return a * b;

    }

    public static double dblArea(double a, double b, double c) {

        return a * b * c;

    }

    /////////////////////////////////////////////////////////
    //Call by Value
    static void Increase(int d) {
        d = d + 1;
    }






}
