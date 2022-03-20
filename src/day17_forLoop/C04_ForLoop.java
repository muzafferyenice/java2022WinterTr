package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");
        }
        System.out.println(30);
        int bas=10;
        int bit=30;
        for (int i = bas; i <=bit ; i++) {
            if (i<bit){
                System.out.print(i+",");
            }else{
                System.out.print(i);
            }
        }
    }
}
