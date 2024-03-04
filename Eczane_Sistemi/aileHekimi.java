import java.util.Scanner;
public class aileHekimi implements muayeneUcreti
{
    public void sigortaBilgisi()
    {
        System.out.println("Sigorta bilgileriniz bulunan seçeneği yazarak giriniz:\n 1-)SGK Emekli ve Yakını\n 2-)SGK Çalışan ve Yakını\n 3-)Yeşil Kart\n 4-)Devlet Memuru ve Yakını");
        Scanner scan = new Scanner(System.in);
        int sigortaBilgisi = scan.nextInt();
        int muayeneUcreti;

        if (sigortaBilgisi==1) {
            muayeneUcret();
        }
        else if (sigortaBilgisi==2) {
            muayeneUcret();
        }
        else if (sigortaBilgisi==3) {
            muayeneUcret();
        }
        else if (sigortaBilgisi==4) {
            muayeneUcret();
        }
    }

    public int muayeneUcret() {
        int muayeneUcreti=10;
        System.out.println("Muayene ücretiniz 10 TL dir. ");
        return muayeneUcreti;
    }
}
