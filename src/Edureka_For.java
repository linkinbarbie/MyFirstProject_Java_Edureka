//Write a program to print 10 even numbers and 10 odd numbers
public class Edureka_For {
    public static void main(String[] args) {
        for(int val = 2;  val <= 21 ; val++)//iterate all numbers less than equal to 21
            if (val % 2 == 0 ) //then identify which of these numbers can be divided by 2
            System.out.println("Divisible by 2: " + val);
            else
                System.out.println("Not divisible by 2: " + val);


////////////////////////////////////////////////////////////////////////////////////////////////
// Write a program to find factorial of a number
        int i = 1;
        int n = 5;
        //get the value to multiply the factorials by
        for(int num = 1; num <= n; num++) //use for to get all the numbers less than equals to 3
            i=i * num; //multiply the base number by each number incrementally
                System.out.println(i + " is the factorial of " + n);

///////////////////////////////////////////////////////////////////////////////////////////////////
//Write a program to generate tables of 10
        int results = 0;
        for(int r = 1; r <= 3; r++)
            System.out.println("10 x " + r + ": " +r * 10);

////////////////////////////////////////////////////////////////////////////////////////////////////
//Write a program to add the digits of a number
       int o = 65;
        int b = o % 10;
        int x = o / 10;
        int m = b + x;

        System.out.println(m);


    }
}
