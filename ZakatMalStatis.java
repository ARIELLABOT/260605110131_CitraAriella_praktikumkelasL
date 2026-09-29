public class ZakatMalStatis {
    public static void main(String[] args) {
        
        long totalPenghasilan = 3000000;
        long totalPengeluaran = 22400000;
        long surplus = totalPenghasilan - totalPengeluaran;
        long nisab = 21250000;
        
        String kategori;
        long zakat = 0;
        
        // Logika penentuan kategori Muzakki atau Mustahik
        if (surplus >= nisab) {
            kategori = "MUZAKKI (WAJIB ZAKAT)";
            zakat = (long) (surplus * 0.025); // Zakat 2.5%
        } else {
            kategori = "MUSTAHIK (MISKIN)";
            zakat = 0;
        }
        
        // Menampilkan output dengan format sesuai layar Anda
        System.out.println("Total Penghasilan : " + totalPenghasilan);
        System.out.println("Total Pengeluaran : " + totalPengeluaran);
        System.out.println("Surplus           : " + surplus);
        System.out.println("Nisab             : " + nisab);
        System.out.println("Kategori          : " + kategori);
        System.out.println("Zakat             : " + zakat);
    }
}