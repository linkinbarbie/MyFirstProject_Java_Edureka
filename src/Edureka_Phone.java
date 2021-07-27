//        Consider a classnamed phonewhich have functionalities like make a call, receivea callandmessaging.
//        Based on this scenario John wants to develop an application which will haveclass named Mobile and
//        methods like dial, receiveand message which will demonstrate the functioningof these methods.
//        Use a reference object to call these methods(dial,receive and message and display).



class Mobile {
    String userNumber;
    String userTexts;

    Mobile(String Number, String Texts) {
        userNumber = Number;
        userTexts = Texts;
    }

    String makeCalls(Mobile g){
        return userNumber;

    }
    String makeTexts(Mobile g){
        return userTexts;
    }


}

public class Edureka_Phone {
    public static void main(String[] args) {
        String numInput = "098743434343";
        String txtInput = "Send me a text";
        String Number, TextMsg;
  Mobile m = new Mobile(numInput,txtInput);

  Number = m.makeCalls(m);
  TextMsg = m.makeTexts(m);
        System.out.println("Here is the number provided: "+Number);
        System.out.println("Here is the text provided: "+ TextMsg);

    }
}
