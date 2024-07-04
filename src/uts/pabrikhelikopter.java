package uts;
public class pabrikhelikopter {
    public class HelikopterTempur extends Helikopter {
    // Atribut tambahan untuk helikopter tempur
    private int persenjataan;  // Jumlah persenjataan

    // Konstruktor untuk menginisialisasi atribut
    public HelikopterTempur(String model, String merek, double harga, int persenjataan) {
        super(model, merek, harga);  // Memanggil konstruktor superclass
        this.persenjataan = persenjataan;
    }

    // Method mutator (setter) untuk mengubah persenjataan
    public void setPersenjataan(int persenjataan) {
        this.persenjataan = persenjataan;
    }

    // Method accessor (getter) untuk mendapatkan persenjataan
    public int getPersenjataan() {
        return persenjataan;
    }

    // Method override untuk menampilkan jenis helikopter (Polymorphism)
    public void jenisHelikopter() {
        System.out.println("Ini adalah helikopter tempur.");
    }

    // Method override untuk menampilkan informasi helikopter tempur
    
    public void infoHelikopter() {
        super.infoHelikopter();  // Memanggil method dari superclass
        System.out.println("Persenjataan: " + persenjataan);
    }
}
    
