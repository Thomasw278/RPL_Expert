//Karena Sederhana Berarti operasi hanya 3 angka saja

public class Kalkulator {
    private double angka1;
    private double angka2;
    private double angka3;
    private String operator;
    private String hasil;

    //Getter
    public double getAngka1() {
        return angka1;
    }

    public double getAngka2() {
        return angka2;
    }
    public double getAngka3() {
        return angka3;
    }
    public String getOperator() {
        return operator;
    }
    public String getHasil() {
        return hasil;
    }

    //Setter
    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }
    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }
    public void setAngka3(double angka3) {
        this.angka3 = angka3;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    //Constructor
    public Kalkulator(double angka1, double angka2, double angka3, String operator) {
        //Variabel Tetap Nilainya tergantung input :
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.angka3 = angka3;
        this.operator = operator;

        double akhir = 0;

        if(this.operator.equals("+")){
            akhir = angka1 + angka2 + angka3;
        } else if(this.operator.equals("-")){
            akhir = angka1 - angka2 - angka3;
        } else if(this.operator.equals("*")){
            akhir = angka1 * angka2 * angka3;
        } else if(this.operator.equals("/")){
            if(angka2 == 0 || angka3 == 0){
                throw new ArithmeticException("Division by zero");
            } else {
                akhir = angka1 / angka2 / angka3;
            }
        } else {
            setHasil("Operator Tidak Valid");
        }
        setHasil(String.valueOf(akhir));
    }

}
