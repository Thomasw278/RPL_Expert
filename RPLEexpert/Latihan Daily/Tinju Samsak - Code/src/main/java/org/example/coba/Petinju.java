package org.example.coba;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Petinju {
    private String name;
    private int Stamina;
    private int kekuatan;

    //Getter
    public int getKekuatan() {
        return kekuatan;
    }

    public int getStamina() {
        return Stamina;
    }

    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    public void setStamina(int Stamina) {
        this.Stamina = Stamina;
    }

    //Constructor
    public Petinju(String name, int kekuatan) {
        String inputuser = name;

        //Cara Expert :
        Pattern huruf = Pattern.compile("[A-Za-z]+");
        Pattern angka = Pattern.compile("[0-9]+");

        Matcher mhuruf = huruf.matcher(inputuser);
        Matcher mangka = angka.matcher(inputuser);

        if (mhuruf.find() && mangka.find()) {
            this.name = mhuruf.group();
            setStamina(Integer.parseInt(mangka.group()));
        }
        this.kekuatan = kekuatan;

        //Cara Cepat :
//        this.name = inputuser.replaceAll("[^A-Za-z]", "");
//        this.kekuatan = Integer.parseInt(inputuser.replaceAll("[^0-9]",""));
    }

    public void tinju(Samsak samsak) {
        if (this.kekuatan < samsak.getTingkatKekerasan()) {
            System.out.println("Samsak terlalu keras bagi " + this.name + " sang petinju!");
            samsak.setRusak(true);
        } else {
            setStamina(Stamina - getKekuatan());
            samsak.setDayaTahan(samsak.getDayaTahan() - this.kekuatan);
            System.out.println("Daya tahan samsak berkurang : " + this.kekuatan);
            System.out.println("Stamina petinju " + this.name + " tersisa : " + this.Stamina);
            if (samsak.getDayaTahan() > 0) {
                System.out.println("Daya tahan samsak tersisa : " + samsak.getDayaTahan());
            } else {
                System.out.println("Samsak Hancur!");
                samsak.setRusak(true);
            }
        }
    }
}