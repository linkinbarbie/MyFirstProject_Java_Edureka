class Area{ //method overload is a type of polymorphism. here you can have multiple methods in a class with the same name, different types and different parameters/inputs but all have
    //to follow the same sequence.
    void calculate(int a, int b){
        int side = a * b;
        System.out.println("Area of Rectangle: "+ side);
    }
    void calculate(int a){
        int side = a * a;
        System.out.println("Area of Square: "+ side);
    }
    void calculate(float a){
        float side = a * a;
        System.out.println("Area of Square - float: " + side);
    }
//    int calculate(int a, int b, int c){// this will  not work because class MethodOverload does not does not allow a return option
//        int side = a * b * c;
//        return side;

    }



public class MethodOverload {
    public static void main(String[] args) {
        Area a = new Area();
        a.calculate(3,2)  ;
        a.calculate(5);
        a.calculate(23.344f);

    }


}
