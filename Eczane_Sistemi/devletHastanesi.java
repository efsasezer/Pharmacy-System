import java.util.Scanner;

public class devletHastanesi implements muayeneUcreti
{
    public void sigortaBilgisi()
    {
        System.out.println("Sigorta bilgileriniz bulunan seçeneği yazarak giriniz:\n 1-)SGK Emekli ve Yakını\n 2-)SGK Çalışan ve Yakını\n 3-)Yeşil Kart\n 4-)Devlet Memuru ve Yakını");
        Scanner scan = new Scanner(System.in);
        int sigortaBilgisi = scan.nextInt();

        if (sigortaBilgisi==1)
        {
            muayeneUcret();
            System.out.println("3 Tl'si eczaneye, 17 Tl'si maaşınızdan kesilmektedir.");
        }
        else if (sigortaBilgisi==2)
        {
            muayeneUcret();
        }
        else if (sigortaBilgisi==3)
        {
            muayeneUcret();
        }
        else if (sigortaBilgisi==4)
        {
            muayeneUcret();
        }

    }

    @Override
    public int muayeneUcret() {
        int muayeneUcreti=20;
        System.out.println("Muayene ücretiniz 20 TL dir. ");
        return muayeneUcreti;
    }

}

