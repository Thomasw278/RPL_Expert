package org.example;

    public class STNK {
        private String pemilik;
        private String kodePlat;
        private String lokasi;

        //Getter
        public String getPemilik() {
            return pemilik;
        }
        public String getKodePlat(){
            return kodePlat;
        }
        public String getLokasi() {
            return lokasi;
        }

        //Setter
        public void setPemilik(String pemilik) {
            this.pemilik = pemilik;
        }
        public void setKodePlat(String kodePlat) {
            this.kodePlat = kodePlat.toUpperCase().split(" ")[0];
        }
        public void setLokasi(String lokasi) {
            String plat = kodePlat.toUpperCase();
            String platno = "";
            if(plat.equals("BE")){
                platno = "Lampung";
            } else if(plat.equals("AB")){
                platno = "Jogja";
            } else if(plat.equals("D")){
                platno = "Bandung";
            } else if(plat.equals("B")){
                platno = "Jakarta";
            } else {
                platno = "Lokasi Tidak Diketahui";
            }
            this.lokasi = platno;
        }

        //Constructor
        public STNK(String pemilik,String kodePlat){
            this.pemilik=pemilik;
            setKodePlat(kodePlat);
            setLokasi(kodePlat);
        }
    }