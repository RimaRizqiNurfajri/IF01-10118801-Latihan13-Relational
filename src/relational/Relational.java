/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relational;

/**
 *
 * @author
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      : 10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * Hasil oprerasi logika matematika dengan relasi
 */
public class Relational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil1 = 10;
        int bil2 = 20;
        System.out.println("a == b = " + (bil1 == bil2));
        System.out.println("a != b = " + (bil1 != bil2));
        System.out.println("a > b = " + (bil1 > bil2));
        System.out.println("a < b = " + (bil1 < bil2));
        System.out.println("b >= b = " + (bil2 >= bil1));
        System.out.println("b <= b = " + (bil2 <= bil1));
    }
    
}
