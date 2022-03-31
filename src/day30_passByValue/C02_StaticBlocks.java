package day30_passByValue;

public class C02_StaticBlocks {
    {   /*static omayan bloklar obje olusturken calisir
        static bloklar sadece 1 kere en basta calisir ama static olmayan bloklar her obj olusturuken
        yenicen calisir
        */
        System.out.println("static olamayan blok calisti");//instance blok/ obj olusursa calisir
    }
    static{
        System.out.println("static  blok calisti");
    }
    public static void main(String[] args) {
        System.out.println(" main  method basi");
        C02_StaticBlocks obj1= new C02_StaticBlocks();
        C02_StaticBlocks obj2= new C02_StaticBlocks();



    }
}
