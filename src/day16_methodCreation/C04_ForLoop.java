package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        String str = "java harika cok guzel dehset";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));

            /*for (int i=4;i>0;i--){
                System.out.print(i);
            }
*/

        }
    }

}