//Write a program to accept 5 employee IDs and the corresponding names and their salaries from the user and store them in three arrays
//Pass these arrays to a function display() as arguments. This display() will display the content of the arrays in the following format.

//Solution - Create a class and a construct to store the input
class userinput {//program to capture employee information and store in array
    String[] EmployeeID;
    String[] EmployeeName;
    int[] Salary;

    userinput(String EmpID1, String EmpID2, String EmpID3, String EmpID4, String EmpID5, String EmpName1, String EmpName2, String EmpName3,
              String EmpName4, String EmpName5, int EmpSal1, int EmpSal2, int EmpSal3, int EmpSal4, int EmpSal5) {
        EmployeeID = new String[]{EmpID1, EmpID2, EmpID3, EmpID4, EmpID5};
        EmployeeName = new String[]{EmpName1, EmpName2, EmpName3, EmpName4, EmpName5};
        Salary = new int[]{EmpSal1, EmpSal2, EmpSal3,EmpSal4,EmpSal5};//constructor to store the input
    }

    void display(userinput g) {
        String[] a = g.EmployeeID;
        String[] m = g.EmployeeName;
        int[] c = g.Salary;
        int i, j;
        for (i = 0; i < a.length; i++) { //row
            for (j = 0; j < 1; j++) {//columns

                System.out.print(a[i] + " " + m[i] + " " + c[i]); //exchange row for column to get a table view
            }
            System.out.println();
        }
    }
   void display(String[] EmpID, String[] EmpName){//function overloading: passing arrays as arguments
       int i,j;

       for(i=0;i<5;i++){
           for(j=0;j<1;j++){
               System.out.print(EmpID[i]+" "+EmpName[i]);
           }
           System.out.println();
       }

   }
}

public class Assignment_DataHandlingFunctions {
    public static void main(String[] args) throws Exception {
        //  userinput a[] = new userinput[5];
        userinput a = new userinput("00", "002", "003", "004","005","John", "Clark", "Nancy",
                "Joe", "Mary", 600000,550000, 500000,500000,300000);
        a.display(a);
        a.display(new String[]{"00", "002", "003", "004", "005"},new String[]{"John","Clark","Louise","Joe","Mary"});
    }
}


/////



