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
        for(int r = 1; r <= 3; r++)
            System.out.println("10 x " + r + ": " +r * 10);

////////////////////////////////////////////////////////////////////////////////////////////////////
//Write a program to add the digits of a number
        int m = 0; //create a variable for iteratively sum each digit
        int o = 123; //here is the test digit
        int uu = o;
        for (; o != 0; o = o / 10) //initialise m = 0 and if the test digit is greater than 0  then iteratively divide each digit by 10 until o = 0 is false
            m = m + o % 10;//get the remainder and adds it to the sum variable
        System.out.println("Adding digits for "+ uu + " to get " + m);
        //Step 1: int m = 0 - start
        //Step 2: 123 != 0; - the condition not met - check if the condition is met
        //Step 3: take the action = m = m + 123 % 10 - m = 3 - take the action
        //step 4: 12 = 123/10 - this takes you to the next run of the loop - restart the loop


////////        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
 //Write a program to reverse the digits of a number.

        int mainNumber = 645454;
        int answer = 0;
        for(;mainNumber!= 0;mainNumber = mainNumber/10){
            int storeNumber =  mainNumber % 10 ; //20 - split this number to get the remainder and store it here
            answer = answer * 10 + storeNumber;}// -take the remainder and add it to the answer after multiplying answer by 10.
        System.out.println("Answer: "+answer);


    //Write a program to generate 10 Fibonacci numbers
        int counter = 1;
        int firstNum = 0;
        int secondNum = 1;
        for(;counter<=10;counter++){
            System.out.println(firstNum);
            int answer2 = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = answer2;}


    }
}

