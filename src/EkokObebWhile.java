import java.util.Scanner;

public class EkokObebWhile {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int x,y,sayiA,sayiB,obeb=0,ekok=0;
        System.out.println("1. sayıyı gir");
        sayiA= girdi.nextInt();
        System.out.println("2. sayıyı gir");
        sayiB= girdi.nextInt();
        int sayac=1;boolean kontrol=true;
        if (sayiA>sayiB){
            int gec=sayiB;
            sayiB=sayiA;
            sayiA=gec;
        }
        while (kontrol){
            x=sayiA%sayac;
            if(x==0) {
                y=sayiB%sayac;
                if (y==0){
                    obeb=sayac;
                }
            }
            sayac++;
            if (sayac>sayiA) kontrol=false;
        }

        System.out.println("Girdiğiniz sayıların OBEB'i = "+obeb);
        ekok=sayiA*sayiB/obeb;
        System.out.println("Gridiğiniz Sayıların EKOK'u = "+ekok);
    }
}
