import java.util.Scanner;

public class ozelSaglikKurumu implements muayeneUcreti
{
    public void sigortaBilgisi()
    {
        System.out.println("Sigorta bilgileriniz bulunan seçeneği yazarak giriniz:\n 1-)SGK Emekli ve Yakını\n 2-)SGK Çalışan ve Yakını\n 3-)Yeşil Kart\n 4-)Devlet Memuru ve Yakını");
        Scanner scan = new Scanner(System.in);
        int sigortaBilgisi = scan.nextInt();
        int muayeneUcreti;

        if (sigortaBilgisi==1)
        {
            muayeneUcret();
            System.out.println(" 10 Tl'si eczaneye, 20 Tl'si maaşınızdan kesilmektedir.");
        }
        else if (sigortaBilgisi==2)
        {
            muayeneUcret();
            System.out.println("10 Tl'si eczaneye, 20 Tl'si özel kuruma gitmektedir.");
        }

        else if (sigortaBilgisi==3)
        {
            muayeneUcret();
        }
        else
        {
            System.out.println("Yeşil kartlıysanız işlem yaptıramazsınız!");
        }
    }

    public int muayeneUcret() {
        int muayeneUcreti=30;
        System.out.println("Muayene ücretiniz 30 TL dir. ");
        return muayeneUcreti;
    }

}
