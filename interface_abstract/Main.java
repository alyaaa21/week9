package interface_abstract;

public class Main {
    public static void main(String[] args) {
        kendaraanListrik[] daftarKendaraan = new kendaraanListrik[4];
        
        daftarKendaraan[0] = new mobilListrik("Mobil Listrik", 80, 20, 10);
        daftarKendaraan[1] = new motorListrik("Motor Listrik", 30, 10, 5);
        daftarKendaraan[2] = new mobilListrik("Mobil Listrik", 60, 45, 12);
        daftarKendaraan[3] = new motorListrik("Motor Listrik", 25, 20, 4);

        double totalWaktu = 0;
        double totalEnergi = 0;

        for (int i = 0; i < daftarKendaraan.length; i++) {
            kendaraanListrik kendaraan = daftarKendaraan[i];
            
            double waktu = kendaraan.hitungWaktuPengisian();
            double energi = kendaraan.hitungEnergiDibutuhkan();

            totalWaktu = totalWaktu + waktu;
            totalEnergi = totalEnergi + energi;

            System.out.println(kendaraan.getNama() + " -> waktu: " + waktu + " jam, energi: " + energi + " kWh");
        }

        System.out.println();
        System.out.println("Total waktu pengisian seluruh kendaraan: " + totalWaktu + " jam");
        System.out.println("Total energi dibutuhkan: " + totalEnergi + " kWh");
    }
}
