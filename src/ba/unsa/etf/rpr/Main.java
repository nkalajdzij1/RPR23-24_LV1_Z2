package ba.unsa.etf.rpr;
import java.util.Scanner;
class Sumacifara{

    public static int sumaCifara(int n){
        int k=n;
        int r=0;
        while(k!=0){
            r+=k%10;
            k/=10;
        }
        return r;
    }
}


public class Main {
    public static void main(String[] args){
    System.out.println("Unesite n: ");
    Scanner unos= new Scanner(System.in);
    int n;
    n=unos.nextInt();

    System.out.println("Brojevi djeljivi sa svojom sumom cifara su: ");

    for(int i=1; i<=n; i++){
        if(i%Sumacifara.sumaCifara(i)==0){
            System.out.println(i);
        }
    }

    }
}
