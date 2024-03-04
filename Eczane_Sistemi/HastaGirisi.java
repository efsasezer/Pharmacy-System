import java.util.HashMap;

public  class HastaGirisi
{
    private final String hastaTc;
    private  final String emeklilikDurumu;

    public HastaGirisi(String hastaTc, String emeklilikDurumu) {

        this.hastaTc = hastaTc;
        this.emeklilikDurumu = emeklilikDurumu;
    }

    public String getHastaTc() {
        return hastaTc;
    }
    public String getEmeklilikDurumu() {
        return emeklilikDurumu;
    }

    public static void atama()
    {
        HashMap<String, String> map= new HashMap<>();
        map.put("23412356785", "SGK Çalışanı ve Yakını");
        map.put("34523412345", "SGK Çalışanı ve Yakını");
        map.put("23456381234", "SGK Emekli ve Yakını");
        map.put("54356743212", "Yeşil Kart");
        map.put("32456784111", "Devlet Memuru ve Yakını");
    }
}
