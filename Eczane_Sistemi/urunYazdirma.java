import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class urunYazdirma {
    public void urunTanitimi()
    {
        Set<String> set = new HashSet<>(7);

        set.add("Majezik  -  18 \n");
        set.add("A-ferin  -  23 \n");
        set.add("Bengay   -  34 \n");
        set.add("Selectra -  53 \n");
        set.add("Pharmaton-  80 \n");

        FileWriter fw= null;
        File dosya1 =null;

        try {
            dosya1=new File("ürünBilgileri.txt");

            if(!dosya1.exists())
                dosya1.createNewFile();

            fw = new FileWriter(dosya1);
            for (String s : set) {
                fw.write(s);
            }
            fw.flush();
            fw.close();
            System.out.println("Dosya yazma işlemi başarıyla tamamlandı");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
