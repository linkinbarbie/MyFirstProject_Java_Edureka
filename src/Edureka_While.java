public class Edureka_While {
    public static void main(String[] args) {
      //  Write a program to print 10 even numbers and 10 odd numbers.
        int num = 0;
        while( num < 20 ){
            if (num % 2 == 0)
            System.out.println("Even Number: "+num);
            else
                System.out.println("Odd Number: "+num);
        num++;}

   // Write a program to find factorial of a number.
        int i = 1;
        int n = 5;
        int factNum = 1;
        while(factNum <= n){
            i=i * factNum;
            factNum++;


        }
        System.out.println("Factorial of " + n + " is " + i);

    // Write a program to generate tables of 10.
        int r = 1;
        while(r <= 6){
            System.out.println("10 * " + r+" = " + (10 * r));
            r++;
        }


    // Write a program to add the digits of a number.
        int m = 0; //create a variable for iteratively sum each digit
        int o = 4533; //here is the test digit
        int uu = o;
        while(o != 0){
            m = m + o % 10;
            o = o / 10;
        }
        System.out.println("Adding all the numbers in " + uu + " will give you " + m);

   // Write a program to add the digits of a number
        int mainNumber = 645454;
        int answer = 0;
        while(mainNumber != 0){
            int storeNumber =  mainNumber % 10 ;
            answer = answer * 10 + storeNumber;
            mainNumber = mainNumber/10;}
            System.out.println("Answer: "+answer);

    }

}
