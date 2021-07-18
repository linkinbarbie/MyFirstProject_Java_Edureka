class Sample {
    int data;

    Sample(int f) { //create a constructor in the class Sample to hold the parameters for Sample.
        data = f;
    }

    void show() {
        System.out.println("Data is: " + data);
    }
}

    public class CallbyRef {

            static void increase(Sample g) {
                g.data = g.data + 1;

            }

        public static void main(String[] args) {
                Sample obj1 = new Sample(9);
                increase(obj1);
                obj1.show();


        }

        }
