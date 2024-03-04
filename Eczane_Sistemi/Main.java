import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException, IOException
    {
        System.out.println("********");
        System.out.println("SEZA ECZANESİ'ne Hoş Geldiniz!");
        System.out.println("********");
        System.out.println("Hastaların bilgileri:");

        FileReader fileReader = new FileReader("hastaBilgileri.txt");
        String line;
        BufferedReader br = new BufferedReader(fileReader);

        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
        br.close();
        System.out.println("********");

        urun agriKesici = new urun(18, "Majezik", "hap", 300);
        urun atesDusurucu = new urun(23, "A-ferin", "şurup", 200);
        urun kasGevsetici = new urun(34, "Bengay", "merhem", 450);
        urun antidepresan = new urun(53, "Selectra", "hap", 450);
        urun vitamin = new urun(80, "Pharmaton", "kapsül", 100);

        System.out.println("Eczanemizde mevcut bulunan ürünler:");
        System.out.println("Ürün Adı - Fiyatı:");

        FileReader fileReader1 = new FileReader("ürünBilgileri.txt");

        BufferedReader br1 = new BufferedReader(fileReader1);

        while ((line = br1.readLine()) != null) {

            System.out.println(line);

        }
        br.close();
        System.out.println("********");

        System.out.println("Lütfen gittiğiniz sağlık kurumunu söyleyiniz:");
        Scanner scan = new Scanner(System.in);
        String saglikKurumu1 = scan.nextLine();

        devletHastanesi sigortaSorgulama = new devletHastanesi();
        aileHekimi sigortaSorgulama2 = new aileHekimi();
        ozelSaglikKurumu sigortaSorgulama3 = new ozelSaglikKurumu();

        if (Objects.equals(saglikKurumu1, "Devlet Hastanesi")) {
            sigortaSorgulama.sigortaBilgisi();
        } else if (Objects.equals(saglikKurumu1, "Aile Hekimi")) {
            sigortaSorgulama2.sigortaBilgisi();
        } else if (Objects.equals(saglikKurumu1, "Özel Sağlık Kurumu")) {
            sigortaSorgulama3.sigortaBilgisi();
        }
        System.out.println("********");

        HastaGirisi hasta1 = new HastaGirisi("23412356785", "SGK Çalışanı ve Yakını");
        HastaGirisi hasta2 = new HastaGirisi("34523412345", "SGK Çalışanı ve Yakını");
        HastaGirisi hasta3 = new HastaGirisi("23456381234", "SGK Emekli ve Yakını");
        HastaGirisi hasta4 = new HastaGirisi("54356743212", "Yeşil Kart");
        HastaGirisi hasta5 = new HastaGirisi("32456784111", "Devlet Memuru ve Yakını");

        System.out.println("Lütfen reçetenizdeki ürünü söyleyiniz:");
        scan = new Scanner(System.in);
        String recetedekiUrun = scan.nextLine();

        System.out.print("Lütfen gittiğiniz sağlık kurumunu seçiniz:\n 1-)Devlet Hastanesi\n 2-)Aile Hekimi\n 3-)Özel Sağlık Kurumu\n");
        scan = new Scanner(System.in);
        int saglikKurumu = scan.nextInt();

        switch (recetedekiUrun) {
            case "Majezik" -> {
                switch (saglikKurumu) {
                    case 1 -> System.out.println("Toplam ücretiniz: " + (agriKesici.getFiyat() + 10));
                    case 2 -> System.out.println("Toplam ücretiniz: " + (agriKesici.getFiyat() + 20));
                    case 3 -> System.out.println("Toplam ücretiniz: " + (agriKesici.getFiyat() + 30));
                }
                break;
            }
            case "A-ferin" -> {
                switch (saglikKurumu) {
                    case 1 -> System.out.println("Toplam ücretiniz: " + (atesDusurucu.getFiyat() + 10));
                    case 2 -> System.out.println("Toplam ücretiniz: " + (atesDusurucu.getFiyat() + 20));
                    case 3 -> System.out.println("Toplam ücretiniz: " + (atesDusurucu.getFiyat() + 30));
                }
                break;
            }
            case "Bengay" -> {
                switch (saglikKurumu) {
                    case 1 -> System.out.println("Toplam ücretiniz: " + (kasGevsetici.getFiyat() + 10));
                    case 2 -> System.out.println("Toplam ücretiniz: " + (kasGevsetici.getFiyat() + 20));
                    case 3 -> System.out.println("Toplam ücretiniz: " + (kasGevsetici.getFiyat() + 30));
                }
                break;
            }
            case "Selectra" -> {
                switch (saglikKurumu) {
                    case 1 -> System.out.println("Toplam ücretiniz: " + (antidepresan.getFiyat() + 10.00));
                    case 2 -> System.out.println("Toplam ücretiniz: " + (antidepresan.getFiyat() + 20));
                    case 3 -> System.out.println("Toplam ücretiniz: " + (antidepresan.getFiyat() + 30));
                }
                break;
            }
            case "Pharmaton" -> {
                switch (saglikKurumu) {
                    case 1 -> System.out.println("Toplam ücretiniz: " + (vitamin.getFiyat() + 10));
                    case 2 -> System.out.println("Toplam ücretiniz: " + (vitamin.getFiyat() + 20));
                    case 3 -> System.out.println("Toplam ücretiniz: " + (vitamin.getFiyat() + 30));
                }
                break;
            }
        }
        System.out.println("********");

        System.out.println("5 Ocak 2023 Çalışan Bilgileri:");

        personel p1 = new personel1();
        personel p2 = new personel2();
        personel p3 = new personel3();
        personel p4 = new personel4();
        personel p5 = new personel5();

        p1.adVer("Ayşe");
        p1.soyadVer(" Yılmaz");
        System.out.print("Maaşı:");
        p1.maasVer((int) 23200);
        p1.mailVer("ayseyilmaz@gmail.com");
        System.out.print("Yaşı:");
        p1.yasVer(32);
        p1.yeniPersonel("Emir", "Ulusoy", "emirulusoy@gmail.com", 24);
        System.out.println("********");

        urunAdedi sayi= new urunAdedi();
        sayi.gelenUrun();

        urunTedarigi alim=new urunTedarigi();
        alim.tedarikSorgulamasi();
        System.out.println("********");

        Calendar c = Calendar.getInstance();
        System.out.println("Mevcut tarih :" + c.getTime());

        sonKullanmaTarihi sorgulama = new sonKullanmaTarihi();
        sorgulama.tarih();
        System.out.println("********");

        nobetciEczane nobetci=new nobetciEczane();
        nobetci.eczane();
    }
}