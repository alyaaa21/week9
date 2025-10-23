package interface_abstract;

public class motorListrik extends kendaraanListrik{
    public motorListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(nama, kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian() {
        double waktuDasar = (this.kapasitasBaterai - this.dayaSaatIni) / this.kecepatanPengisian; 
        return waktuDasar * 1.05;
    }
    
}
