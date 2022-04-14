package day43_garbage_abstractClass;

public abstract class C04 {

    public abstract void absMethod1();

    public void concreteMethod() {
        System.out.println("C04 concrete method");
        }
        public static void concreteStaticMethod() {
            System.out.println("C04 concrete static method");

        }
        public static void main (String[]args){

            System.out.println("bu abst class");
            concreteStaticMethod();
        }
    }
