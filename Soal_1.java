public class Soal_1 {
    String nama;
    String nim;
    String prodi;
    String getnama(){
        return nama="Anawinta";
    }
    String getnim(){
        return nim="202410101008";
    }
    String getprodi(){
        return prodi="Sistem Informasi";
    }
    public static void main(String[] args) {
        Soal_1 mahasiswa = new Soal_1 ();
        System.out.println ("Nama: "+mahasiswa.getnama());
        System.out.println ("Nim : "+mahasiswa.getnim());
        System.out.println ("Prodi : "+mahasiswa.getprodi());
    }

}
