import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int x,y,sayiA,sayiB,obeb=0,ekok=0;
        System.out.println("1. sayıyı gir");
        sayiA= girdi.nextInt();
        System.out.println("2. sayıyı gir");
        sayiB= girdi.nextInt();
        if (sayiA>sayiB){
            int gec=sayiB;
            sayiB=sayiA;
            sayiA=gec;
        }
        for (int i = 1; i <= sayiA ; i++) {
            x=sayiA%i;
            if(x==0) {
                y=sayiB%i;
                if (y==0){
                    obeb=i;
                }
            }
        }
        System.out.println("Girdiğiniz sayıların OBEB'i = "+obeb);
        ekok=sayiA*sayiB/obeb;
        System.out.println("Gridiğiniz Sayıların EKOK'u = "+ekok);
    }
}
