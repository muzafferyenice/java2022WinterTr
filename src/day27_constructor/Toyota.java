package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int lastikadedi=4;
    boolean motoruVarmi=true;
    String model;
    String yakit;
    int yil;

public void maxHiz(){
    if (yakit.equals("Benzin")){
        System.out.println("Benzinli            ");
    }else if (yakit.equals("Dizel")){
        System.out.println("Dizel         ");
    }

}
    public void renkTercihleri() {
        if (model.equals("Corolla")){
            System.out.println("Corolla kirmizi beyaz");
        }else if (model.equals("")){

        }

    }
}
