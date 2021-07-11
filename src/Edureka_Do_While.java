public class Edureka_Do_While {
    public static void main(String[] args) {
        //  Write a program to print 10 even numbers and 10 odd numbers.
        int num = 0;
        do {

            if (num % 2 == 0)
                System.out.println("Even Number: " + num);
            else
                System.out.println("Odd Number: " + num);
            num++;
        }
        while (num < 20);

        // Write a program to find factorial of a number.
        int i = 1;
        int n = 5;
        int factNum = 1;
        do {
            i = i * factNum;
            factNum++;
        }
        while (factNum <= n);
        System.out.println("Factorial of " + n + " is " + i);


        // Write a program to generate tables of 10.
        int r = 1;
        do {
            System.out.println("10 * " + r + " = " + (10 * r));
            r++;
        }
        while (r <= 6);

        // Write a program to add the digits of a number.
        int m = 0; //create a variable for iteratively sum each digit
        int o = 4533; //here is the test digit
        int uu = o;
        do {
            m = m + o % 10;
            o = o / 10;
        }
        while (o != 0);
        System.out.println("Adding all the numbers in " + uu + " will give you " + m);

        // Write a program to reverse the digits of a number
        int mainNumber = 645454;
        int answer = 0;
        do {
            int storeNumber = mainNumber % 10;
            answer = answer * 10 + storeNumber;
            mainNumber = mainNumber / 10;
        }
        while (mainNumber != 0);
        System.out.println("Answer: " + answer);

        // Write a program to generate 10 Fibonacci numbers
        int counter = 1;
        int firstNum = 0;
        int secondNum = 1;
        do {
            System.out.println(firstNum);
            int answer2 = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = answer2;
            counter++;
        }
        while (counter <= 10);
    }
}