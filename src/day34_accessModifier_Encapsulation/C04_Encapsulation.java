package day34_accessModifier_Encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /* bir variable i encapsule etmek icin
        1- Access modifier i private yapariz
        2- okuma ve yzzama ozelliklerini kullanmasini istedigimiz gibi
        sinirlayabiliriz
            - eger sadce okunmasini istiyorsaniz getter
            - sadece deger girilebilsin isterseniz setter methodlarini
            olustururuz

        bir variable icin hem getter hem setter olusturursaniz o variable
        public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

        piyasa da developer lar da boyle yapar
         */
        C03 obj =new C03();
        System.out.println(obj.getSayi());
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());

        System.out.println(obj);

    }

}
