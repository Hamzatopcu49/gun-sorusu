import java.util.Scanner;

public class gun {
 public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.print("LÜTFEN BELİRTİLEN KOŞULLARA UYGUN SAYI GİRİNİZ=");
    int sayi=klavye.nextInt();
    while(sayi<0 || sayi>365){
    System.out.print("LÜTFEN UYGUN SAYI GİRİNİZ=");
    sayi=klavye.nextInt();
    }
    String yaz="";
    int gun=sayi%7;
    if(gun==0)
    yaz="cumartesi";
    else if(gun==1)
    yaz="pazar";
    else if(gun==2)
    yaz="pazartesi";
    else if(gun==3)
    yaz="salı";
    else if(gun==4)
    yaz="çarşamba";
    else if(gun==5)
    yaz="perşembe";
    else if(gun==6)
    yaz="cuma";
    System.out.println("BUGÜN CUMARTESİ "+ sayi +" gün sonra "+yaz+ "günü" );
    
    
    
    
    
    }
    
}
