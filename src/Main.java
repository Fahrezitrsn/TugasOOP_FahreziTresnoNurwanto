public class Main {
    public  static void main(String[] args){

        Manager Eko = new Manager();
        Programmer Budi= new Programmer();

        Eko.setNama("Eko");
        Budi.setNama("Budi");
        Eko.setGajiPokok(7000000);
        Eko.setTunjangan(3000000);
        Budi.setGajiPokok(7000000);
        Budi.setBonus(2000000);
        Eko.cetakInfo();
        Budi.cetakInfo();
    }
}
