

//Alex wants an application for his restaurant in which he needs to display the drinks available in his restaurant to the customers
//        along with their prizes.Create an application which will display the menu items along with the prizes and once the order
//        is done,it will calculate the total amount of the order and display it to the customers.

class Menu {
    String[] Drink_Order;
    String[] Drink_List;
    int[] Prices_List;

    Menu(String[] Drink_Name, String[] Drinks, int[] Prices) {
        Drink_Order = Drink_Name;
        Drink_List = Drinks;
        Prices_List = Prices;
    }

    void display(Menu g) {

        String[] a = g.Drink_List;//drink list
        String[] b = g.Drink_Order;
        int[] c = g.Prices_List;
        int index = 0;
        int i, j;
        System.out.println("Menu List based on your list: ");
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (b[i].equals(a[j])) {//use equals for text to text comparison
                    index = index + c[j];
                    System.out.println(b[i] + " " + "Price: " + " "+ c[j]);

                }

            }

        }

        System.out.println("Total cost of the drinks: " + index);
    }
}

public class Application_Resturant {
    public static void main(String[] args) {
        Menu mn_list = new Menu(new String[]{"Soda","Gin","Orange Tang"},new String[]{"Whisky","Soda","Gin","KingKong","Orange Tang"},new int[]{23,4,55,78,45});
        mn_list.display(mn_list);
    }

}
