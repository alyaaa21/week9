package praktikum1;

public abstract class Hewan {
    private String nama;
    private int jumKaki;
    boolean bisaTerbang;

    public Hewan(String nama, int jumKaki, boolean bisaTerbang){
        this.nama = nama;
        this.jumKaki = jumKaki;
        this.bisaTerbang = bisaTerbang;
    }

    public void isHewan(){
        System.out.println("nama: " + nama + "jumlah kaki: " + jumKaki + "apakah bisa terbang :" + bisaTerbang);
    }

    public abstract void bersuara();


}
