import java.util.Scanner;

public class urunAdedi implements gelenUrun , gidenUrun
{
    public int raftakiUrunSayisi = 500;
    public static int depodakiUrunSayisi = 1000;
    public int gelecekUrun;
    protected int gidecekUrun;

    public void gelenUrun()
    {
        System.out.println("Gelecek ürün sayısını yazınız : ");
        Scanner scan = new Scanner(System.in);
        int gelecekUrun = scan.nextInt();
        urunYerlestirme(gelecekUrun);
    }

    public void urunYerlestirme(int gelecekUrun)
    {
        System.out.println("Ürünlerin nereye yerleştirileceği bilgisini rakamla giriniz : ");
        System.out.println("1-) Raf \n2-) Depo ");
        Scanner scan2 = new Scanner(System.in);
        int secim = scan2.nextInt();
        switch (secim) {
            case 1:
                raftakiUrunSayisi+=gelecekUrun;
                System.out.println("Raftaki güncel ürün sayısı:" + raftakiUrunSayisi);
                break;
            case 2:
                depodakiUrunSayisi+=gelecekUrun;
                System.out.println("Depodaki güncel ürün sayısı:" + depodakiUrunSayisi);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }
    }

    public void satilanUrun()
    {
        System.out.println("Satılan ürün sayısını yazınız : ");
        Scanner scan1 = new Scanner(System.in);
        gidecekUrun = scan1.nextInt();
        urunYeri(gidecekUrun);
    }
    public void urunYeri (int gidecekUrun)
    {
        System.out.println("Ürünlerin nereden satılacağı bilgisini rakamla giriniz : ");
        System.out.println("1-) Raf \n2-) Depo ");
        Scanner scan2 = new Scanner(System.in);
        int secim = scan2.nextInt();
        switch (secim) {
            case 1:
                raftakiUrunSayisi-=gidecekUrun;
                System.out.println("Raftaki güncel ürün sayısı:" + raftakiUrunSayisi);
                break;
            case 2:
                depodakiUrunSayisi-=gidecekUrun;
                System.out.println("Depodaki ürün sayısı:" + depodakiUrunSayisi);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }
    }
}