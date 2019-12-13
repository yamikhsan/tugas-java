import java.util.Scanner;

public class RumusMath{

    private static Scanner scan;

    public static void main(String[] args){

        scan = new Scanner(System.in);

        menu();

    }

    private static void menu(){
            
            boolean run = true;
    
            while(run){

                try {
    
                    println("------------------------------------------------");
        
                    println("Menu");
                    println("1. Luas Segitiga");
                    println("2. Volume Balok");
                    println("3. Volume Prisma Segitiga");
                    println("4. Volume Kerucut");
                    println("5. Exit");
            
                    print("Pilih menu = ");
        
                    int i = scan.nextInt();
        
                    switch (i) {
                        case 1:
                            luasSegitiga();
                            break;
        
                        case 2:
                            volumeBalok();
                            break;
        
                        case 3:
                            volumePrismaSegitiga();
                            break;
        
                        case 4:
                            volumeKerucut();
                            break;
        
                        case 5:
                            run = false; 
                            break;
                    
                        default:
                            println("Menu tidak ada");
                            break;
                    }

                    exitMenu();
        
                    println("------------------------------------------------");

                } catch (Exception e) {
                    println("harus input type data int");
                    run = false;
                }
    
            } 
        
    }

    private static void luasSegitiga() {

        try {
            
            print("Alas = ");
            double a = scan.nextDouble();

            print("Tinggi = ");
            double t = scan.nextDouble();
    
            double hasil = segitiga(a, t);
            println("Luas = " + hasil);

        } catch (Exception e) {
            println("Inputan data harus tipe double");
        }
        
    }

    private static void volumeBalok() {

        try {
            
            print("Panjang = ");
            double p = scan.nextDouble();

            print("Lebar = ");
            double l = scan.nextDouble();

            print("Tinggi = ");
            double t = scan.nextDouble();
    
            double hasil = p * l * t;
            println("Volume = " + hasil);

        } catch (Exception e) {
            println("Inputan data harus tipe double");
        }
        
    }

    private static void volumePrismaSegitiga() {

        try {
            
            print("Alas = ");
            double a = scan.nextDouble();

            print("Lebar = ");
            double l = scan.nextDouble();

            print("Tinggi = ");
            double t = scan.nextDouble();
    
            double segitiga = segitiga(a, l);
            double hasil =  segitiga * t ;
            println("Volume = " + hasil);

        } catch (Exception e) {
            println("Inputan data harus tipe double");
        }

    }

    private static void volumeKerucut() {

        final double pi = 3.14;
        
        try {
            
            print("Jari-jari = ");
            double r = scan.nextDouble();

            print("Tinggi = ");
            double t = scan.nextDouble();

            double hasil = (pi * r * r) * t / 3;
            println("Volume = " + hasil);

        } catch (Exception e) {
            println("Inputan data harus tipe double");
        }
        
    }

    private static void exitMenu(){
        print("Input 1 jika ingin lanjut jika tidak input apa saja = ");
        int res = scan.nextInt();
        if(res != 1){
            System.exit(1);
        }
    }

    private static double segitiga(double a, double t){
        return a * t / 2;
    }

    private static void println(Object obj){
        System.out.println(obj);
    }

    private static void print(Object obj){
        System.out.print(obj);
    }

}