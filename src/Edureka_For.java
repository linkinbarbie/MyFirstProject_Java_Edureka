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
//        Statement 1 is executed (one time) before the execution of the code block.

//        Statement 2 defines the condition for executing the code block.

//        Statement 3 is executed (every time) after the code block has been executed.

//        int o = 65;
//        int b = o % 10;
//        int x = o / 10;
//          int b = 0;
        int m = 0; //create a variable for iteratively sum each digit
        int o = 651778231; //here is the test digit
        int uu = o;
//        int m = b + x;

        for (m = 0; o != 0; o = o / 10) //initialise m = 0 and if the test digit is greater than 0  then iteratively divide each digit by 10 until o = 0 is false
             m = m + o % 10;//get the remainder and adds it to the sum variable
        System.out.println("Adding digits for "+ uu + " to get " + m);

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////
 //Write a program to reverse the digits of a number.


        int w = 0;//declare the test variable, the second variable for print line,
        int ni = 6558;
//        int x = q % 10;
//        int z = q / 10;
//        int ii = (x * 10)+z;

        for(int q = 6558; q != 0; q = q / 10) {

            int yu = q % 10;
             w = w * 10 + yu;
        }
        System.out.println("Reverse to " + ni + " get " + w);

    }
}
