package hitungan;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        //membuat objek
        Matematika najmi = new Matematika(3,3);
        
        System.out.println("Hasil Penjumlahan :"+najmi.setPenjumlahan());
        
        System.out.println("Hasil Pengurangan :"+najmi.setPengurangan());
        
        System.out.println("Hasil Perkalian   :"+najmi.setPerkalian());
        
        System.out.println("Hasil Pembagian   :"+najmi.setPembagian());
    }
}
