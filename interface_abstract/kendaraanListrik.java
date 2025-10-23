package interface_abstract;

public abstract class kendaraanListrik implements konsumsiEnergi{
    private String nama;
    double kapasitasBaterai;
    double dayaSaatIni;
    double kecepatanPengisian;

    public kendaraanListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian){
        this.nama = nama;
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    public String getNama(){
        return nama;
    }

    public abstract double hitungWaktuPengisian();

    @Override
    public double hitungEnergiDibutuhkan(){
        return this.kapasitasBaterai - this.dayaSaatIni;
    }
}
