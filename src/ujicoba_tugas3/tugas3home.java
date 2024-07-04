package ujicoba_tugas3;


public class tugas3home {
    
    public void infoElektronik() {
     System.out.println("Nama: " + nama);
     System.out.println("Merek: " + merek);
     System.out.println("Harga: " + harga);
    }

    public static void main(String[] args) {
        // Membuat objek elektronik
        Elektronik laptop = new Elektronik("Laptop", "Asus", 12000000);

        // Menampilkan informasi awal
        System.out.println("Informasi Awal:");
        laptop.infoElektronik();

        // Mengubah harga dengan menggunakan method mutator
        laptop.setHarga(12500000);

        // Menampilkan informasi setelah perubahan
        System.out.println("\nInformasi Setelah Perubahan:");
        System.out.println("Harga " + laptop.getNama() + " setelah dinaikkan: " + laptop.getHarga());
    }
}
