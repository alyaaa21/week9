package interface_abstract;

public class mobilListrik extends kendaraanListrik {
    
    public mobilListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    public double hitungWaktuPengisian(){
        double waktuDasar = (this.kapasitasBaterai - this.dayaSaatIni) / this.kecepatanPengisian;
        return waktuDasar * 1.1;
    }
}
