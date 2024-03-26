public class EnhanceIf{
    public static void main(String[] args){
        int i = 3; // Mengatur nilai i untuk dijadikan pembanding pada enhanced if
        System.out.println((i > 3) ? "i is greater than 3" : (i < 3) ? "i is smaller than 3" : "i is equal to 3");
        /* 
        Enhanced if memiliki sistem condition, yang berada dalam kurung
        Dan setelah tanda tanya, enhanced if memiliki statement true dan false. Tapi, hanya bisa dalam 1 baris.
        Dalam contoh di atas, statement false atau else diisi berupa enhanced if juga membuat else if dalam bentuk enhanced if
        Namun, enhanced if hanya dapat digunakan dalam kondisi return. Oleh sebab itu, tidak dapat digunakan seenaknya seperti regular if tanpa tindak lanjut dari hasil return dari if tersebut.
        Enhanced if dapat diartikan sebagai sebuah method yang mengembalikan hasil bila true maupun false dan return tersebut dapat berupa method lainnya juga.
        */
    }
}