public class Mahasiswa extends Manusia{
    String nim;
    String jurusan;

    public void cetakInfo(){
        // memanggil method superclass.
        super.cetakInfo();

        System.out.println("NIM         : " + this.nim);
        System.out.println("Jurusan     : " + this.jurusan);
    }
}
