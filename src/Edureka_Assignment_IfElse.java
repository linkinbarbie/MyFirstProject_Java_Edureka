public class Edureka_Assignment_IfElse {

    public static void main(String[] args) {
        //check if the candidate is eligible to vote
        //check if the number is positive or negative
        int Age = 18;
        boolean boolVote;
        if (Age >= 18 && Age > 0)//check if the candidate is older than 18 and the age provided is positive
            boolVote = true;
        else
            boolVote = false;
        System.out.println("Check if the candidate is eligible to vote: " + boolVote);


        ////////////////////////////////////////////////////////////////////////////
        //find the largest of two numbers
        int Number1 = 87;
        int Number2 = 34;
        if(Number1 > Number2)
            System.out.println(Number1 + " is greater than " + Number2);
        else if(Number2 > Number1)
            System.out.println(Number2 + " is greater than " + Number1);

        /////////////////////////////////////////////////////////////////////////////
        //check if a given number is even or odd
        int chkNumber = 4;
        boolean boolEven;
        if(chkNumber % 2 == 0)
            boolEven = true;
        else
            boolEven = false;
        System.out.println("The given number is even: " + boolEven);


    }





}
