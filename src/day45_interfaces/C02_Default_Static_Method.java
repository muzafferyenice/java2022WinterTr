package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{


    @Override
    public void method() {
        System.out.println("child class method");
    }

   /* @Override
    public void method1() {
        System.out.println("child class meyhod 1");
    }parent interface deki overide methodu istersek override ederiz
*/
    public static void main(String[] args) {
        I01_Default_Static.method2();
        C02_Default_Static_Method obj=new C02_Default_Static_Method();
        obj.method();//child dan calisir
        obj.method1();//parent interface dan gelcek
      //  obj.method2(); eski klasdan static uyeye static olmyan yolarlada ulasilir
        //ancak interface icindeki static olana static olmayan yontemle ulasilamaz

    }
}
