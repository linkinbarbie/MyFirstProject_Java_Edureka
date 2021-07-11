import com.sun.deploy.security.SelectableSecurityManager;

public class Edureka_Case_Study_Intro {
    public static void main(String[] args) {
        //This application should have ticket prize as Rs400 per person and
        // if a person buys more than 10 tickets then person is
        // eligible for 10 percent discount.Calculate the total bill or amount
        // according to the number of tickets that are sold.
        int intTicket = 4800;
        int intPrice = 0;
        if (intTicket / 400 >= 10) {
            intPrice = intTicket - (intTicket / 10);
        } else {
            intPrice = intTicket;
        }
        System.out.println("Total tickets bought " + (intTicket / 400) + ". Total cost of tickets is: " + intPrice);

        // Case Study 2
        //John and Paul went to watch a movie in theatre where they need to buy two tickets.
        // There are two types of tickets,one Golden category and other as silver category.
        // If they buy tickets for silver category,then per person a ticket should cost Rs.150
        // and for golden category ticket should cost them Rs.200 each.Considering this scenario,
        // write a program for theatre ticket booking application scenario.
        int intTicket2 = 150;
        if (intTicket2 == 150) {
            System.out.println("Customer wants to buy a silver ticket");
        } else if (intTicket2 == 200) {
            System.out.println("Customer wants to buy a golden ticket");
        } else {
            System.out.println("Ticket prices can only be 150 for silver ticket or 200 for gold ticket");


        }
    }
}