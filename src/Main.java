
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n;
        System.out.print("Lutfen bir sayi giriniz : ");
        n = input.nextInt();
        System.out.println("4 un katlari :");
        for(int i=1; i<=n ;i*=4){
            System.out.println(i);
        }
        System.out.println("5 in katlari :");
        for(int j=1; j<=n ;j*=5){
            System.out.println(j);
        }


    }



    }
