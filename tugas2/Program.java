public class Program{
    public static void main(String[] args) {

        System.out.println("SEGITIGA");
        Segitiga segitiga = new Segitiga();
        segitiga.setSisi(6, 5);
        segitiga.hitungLuas(); 
        segitiga.hitungKeliling();

        System.out.println("");

        System.out.println("PERSEGI");
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        System.out.println("");

        System.out.println("PERSEGI PANJANG");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjangLebar(5, 4);;
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        
        System.out.println("");
        
        System.out.println("LINGKARAN");
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(5);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
    }
}

class BangunDatar{
    double luas, keliling;

    void hitungLuas(){
        System.out.println("luas...");
    }

    void hitungKeliling(){
        System.out.println("keliling...");
    }
}

class Segitiga extends BangunDatar{

    double tinggi, sisi;

    void setSisi(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    void hitungLuas(){
        super.hitungLuas();
        this.luas = (sisi * tinggi)/2;
        System.out.println(luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        this.keliling = sisi * 3;
        System.out.println(keliling);
    }

}

class Persegi extends BangunDatar{

    double sisi;

    void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    void hitungLuas(){
        super.hitungLuas();
        this.luas = sisi * sisi;
        System.out.println(luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        this.keliling = sisi * 4;
        System.out.println(keliling);
    }

}

class PersegiPanjang extends BangunDatar{

    double panjang, lebar;

    void setPanjangLebar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    void hitungLuas(){
        super.hitungLuas();
        this.luas = panjang * lebar;
        System.out.println(luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        this.keliling = (panjang * 2) +(lebar * 2);
        System.out.println(keliling);
    }

    
}

class Lingkaran extends BangunDatar{

    final double pi = 3.14;
    double r;

    void setJari(double r){
        this.r = r;
    }

    @Override
    void hitungLuas(){
        super.hitungLuas();
        this.luas = pi * r * r;
        System.out.println(luas);
    }

    @Override
    void hitungKeliling(){
        super.hitungKeliling();
        this.keliling = 2 * pi * r;
        System.out.println(keliling);
    }
}