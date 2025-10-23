package praktikum1;

public class Main {
    public static void main(String[] args){
        Hewan sapi = new Sapi("sapi", 4, false);
        Hewan burung = new Burung("burung", 2, true);
    
        sapi.bersuara();;
        burung.bersuara();
        sapi.isHewan();
    }
}
