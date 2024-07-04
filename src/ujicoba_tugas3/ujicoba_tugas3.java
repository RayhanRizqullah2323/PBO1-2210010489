package ujicoba_tugas3;


public class ujicoba_tugas3 {
    
    public class Elektronik {
    // Atribut
    private String nama;
    private String merek;
    private double harga;
    

    // Konstruktor
    public Elektronik(String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }

    // Method mutator (setter)
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getMerek() {
        return merek;
    }

    public double getHarga() {
        return harga;
    }
}