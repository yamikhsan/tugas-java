import java.util.Scanner;

public class RumusMath{

    private static Scanner scan;

    public static void main(String[] args){

        scan = new Scanner(System.in);

        menu();

    }

    private static void menu(){
        println("Menu");
        println("1. Luas Segitiga");
        println("2. Volume Balok");
        println("3. Volume Prisma Segitiga");
        println("4. Volume Kerucut");
        println("5. Exit");

        print("Pilih menu = ");
        int res = scan.nextInt();
        println(res);
    }

    private static void println(Object obj){
        System.out.println(obj);
    }

    private static void print(Object obj){
        System.out.print(obj);
    }

}