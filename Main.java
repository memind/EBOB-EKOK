import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n1, n2, ebob = 0, i=1, j = 1, saglama;
        boolean n1Kucuk, n2Kucuk, nEsit;
        Scanner inp = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("n2 Sayısını Giriniz: ");
        n2 = inp.nextInt();

        n1Kucuk = n1<n2;
        n2Kucuk = n2<n1;
        nEsit = n1==n2;

        while(n1Kucuk && i<=n1){
            if(n1%i == 0 && n2%i == 0){
            ebob = i;}
            i++;
        }
        
        while(n2Kucuk && i<=n2){
            if(n1%i == 0 && n2%i == 0){
            ebob = i;}
            i++;
        }

        while(nEsit && i<=n1){
            if(n1%i == 0){
            ebob = i;}
            i++;
        }

        while(j<=(n1*n2)){
            if(j%n1 == 0 && j%n2 == 0){break;}
            else{j++;}
        }
        saglama = (n1*n2)/ebob;
        
        System.out.println("EBOB = "+ebob);
        System.out.println("EKOK = "+j);
        System.out.println("EKOK = (n1*n2)/EBOB Formülüne Göre Sağlama: "+saglama);
    }
}