package pboif2.pkg10119065.latihan63.gradiengarislurus;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program mehitung gradien dari 2 koordinat
 */
public class PBOIF210119065Latihan63GradienGarisLurus {
    
    public static void main(String[] args) {
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.print("Garis yang melalui titik ");
        System.out.print("("+koordinat1.getX1()+", "+koordinat1.getY1()+") dan ");
        System.out.println("("+koordinat1.getX2()+", "+koordinat1.getY2()+") ");
        System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());
        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.print("Garis yang melalui titik ");
        System.out.print("("+koordinat2.getX1()+", "+koordinat2.getY1()+") dan ");
        System.out.println("("+koordinat2.getX2()+", "+koordinat2.getY2()+") ");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien());
    }
    
}
