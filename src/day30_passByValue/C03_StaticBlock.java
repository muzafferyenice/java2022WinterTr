package day30_passByValue;

public class C03_StaticBlock {
    public static int age;

    static{
        System.out.println("Static blok 1 calisit");
        age=24;
    }
    static{
        System.out.println("Static blok 2 calisit");
        age=25;
    }
    public C03_StaticBlock(){
        System.out.println("constructor calisti");
        System.out.println("++age = " + ++age);

    }

    public static void main(String[] args) {
        System.out.println("main method calisti 1 ");
        System.out.println(++age);
        C03_StaticBlock obj1= new C03_StaticBlock();
        System.out.println("main method calisti 2 ");
    }
}
