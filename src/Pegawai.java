public class Pegawai {
    private String nama;
    private double gajiPokok;

    //set
    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //get
    public String getNama(){
        return this.nama;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

  public void cetakInfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("gajiPokok:  " + getGajiPokok());
  }
}