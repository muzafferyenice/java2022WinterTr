package day34_accessModifier_Encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {
     C01  obj =new C01();

     obj.acikString="Bye";
     C01.aciksayi=50;

     //C01.sayi=15;  private access modifier i oldugundan baska class dan erisilmez

    //obj.method1; private access modifier i oldugundan baska class dan erisilmez

       // C01 objParametreli=new C01(5);//C01 deki cons private olsaydi bu calismazdi

    }
}
