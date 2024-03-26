public class EnhanceFor {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10}; // Mengatur array yang dapat digunakan dalam for each
        int sum = 0; // Mengatur nilai awal sum untuk digunakan dalam contoh perulangan for each
        for(int num:nums){
            System.out.println(num);
            sum += num;
        }
        /*
        Enhanced for atau for each dapat digunakan untuk mengatur sebuah variabel sementara sebagai key dalam perulangan
        Namun, syarat untuk menggunakan for each adalah harus memiliki sebuah array yang dapat digunakan untuk perulangan
        Perbedaannya dengan basic for adalah variabel yang di dalam for each berisi data yang diambil secara berurutan dari dalam array sampai seluruh value array selesai diloop ber
        Sedangkan dalam for, varibel yang digunakan adalah perhitungan yang entah naik atau turun sampai syarat yang diberikan terpenuhi
         */
        System.out.println(sum); // Menampilkan nilai sum akhir
    }
}
