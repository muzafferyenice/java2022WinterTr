package day30_passByValue;

public class C01_StaticBlocks {
    static {                // class calsimaya baslamadan on atama yapmamizi saglar / yerinin bir onemi yok
        System.out.println("static blok 1 calisti");
    }
    static {                // class calsimaya baslamadan on atama yapmamizi saglar / yerinin bir onemi yok
        System.out.println("static blok 2 calisti"); // static blok birden fazla olurssa yukaridan asagi calsir
    }
        C01_StaticBlocks(){
            System.out.println("constructo calisti");
        }
    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");

    }
}
