package Collection;

public class myClass2 extends myClass1 {
    @Override
    void myFunction12(){
        System.out.println("MyFunction12 is executing...");
    }

    public static void main(String args[]) {
        myClass2 ob1 = new myClass2();
        ob1.myFunction11();
        ob1.myFunction12();

        myClass1 ob2 = new myClass1() {
            @Override
            void myFunction12() {

            }
        };
    }
}

