import java.util.ArrayList;

public class Kalkulator {
    private ArrayList<Double> AngkaList = new ArrayList<>();
    private String Operator;
    private double Hasil;

    //Getter
    public String getOperator() {
        return Operator;
    }
    public Double getHasil() {
        return Hasil;
    }
    public ArrayList<Double> getAngkaList() {
        return AngkaList;
    }

    //Setter
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }
    public void setHasil(Double Hasil) {
        this.Hasil = Hasil;
    }
    public void setAngkaList(ArrayList<Double> AngkaList) {
        this.AngkaList = AngkaList;
    }

    //Constructor
    public Kalkulator(ArrayList<Double> AngkaList, String Operator) {
        this.AngkaList = AngkaList;
        this.Operator = Operator;
        double Hasil = 0;
        double AngkaPertama = 0;
        if(AngkaList.size()==0){
            Hasil = 0;
        }
        else {
            AngkaPertama = AngkaList.get(0);
            switch (Operator) {
                case "+":
                    for(int i=1 ; i < AngkaList.size() ; i++){
                        Hasil = AngkaPertama +=  AngkaList.get(i);
                    }
                    break;
                case "-":
                    for(int i=1 ; i < AngkaList.size() ; i++){
                        Hasil = AngkaPertama -=  AngkaList.get(i);
                    }
                    break;
                case "*":
                    for(int i=1 ; i < AngkaList.size() ; i++){
                        Hasil = AngkaPertama *=  AngkaList.get(i);
                    }
                    break;
                case "/":
                    for(int i=1 ; i < AngkaList.size() ; i++){
                        if(AngkaList.get(i) == 0){
                            throw new ArithmeticException("Error Division by Zero");
                        } else {
                            Hasil = AngkaPertama /= AngkaList.get(i);
                        }
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Operator Tidak valid");
            }
        }
        this.Hasil = Hasil;
    }

}
