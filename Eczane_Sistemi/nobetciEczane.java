import java.util.HashMap;
import java.util.Scanner;

public class nobetciEczane {

    public static void eczane()
    {
        HashMap<String,String> map = new HashMap<>();
        map.put("Pazartesi","Mine Eczanesi");
        map.put("Salı","Burak Eczanesi");
        map.put("Çarşamba","Nehir Eczanesi");
        map.put("Perşembe","Evren Eczanesi");
        map.put("Cuma","Vefa Eczanesi");
        map.put("Cumartesi","Seza Eczanesi");
        map.put("Pazar","Uludağ Eczanesi");

        System.out.println("Haftanın hangi günü nöbetçi eczane aradığınız bilgisini giriniz:");
        Scanner scan = new Scanner (System.in);
        String gun = scan.nextLine();

        switch(gun)
        {
            case "Pazartesi":
                System.out.println("Nöbetçi eczane:" + map.get("Pazartesi"));
                break;

            case "Salı":
                System.out.println("Nöbetçi eczane:" + map.get("Salı"));
                break;
            case "Çarşamba":
                System.out.println("Nöbetçi eczane:" + map.get("Çarşamba"));
                break;
            case "Perşembe":
                System.out.println("Nöbetçi eczane:" + map.get("Perşembe"));
                break;
            case "Cuma":
                System.out.println("Nöbetçi eczane:" + map.get("Cuma"));
                break;
            case "Cumartesi":
                System.out.println("Nöbetçi eczane:" + map.get("Cumartesi"));
                break;
            case "Pazar":
                System.out.println("Nöbetçi eczane:" + map.get("Pazar"));
                break;
        }

    }

}