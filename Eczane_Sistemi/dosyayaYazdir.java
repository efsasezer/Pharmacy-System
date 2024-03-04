import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dosyayaYazdir
{
    public void main()
    {
        List<String> list = new ArrayList<>(7);
        list.add("İsim  Soyisim Yaş \n");
        list.add("Yeliz Metin   17 \n");
        list.add("Ayşen Yılmaz  36 \n");
        list.add("Kemal Demir   87 \n");
        list.add("Burcu Ceylan  25  \n");
        list.add("Yakup Ceylan  28  \n");

        FileWriter fw= null;
        File dosya =null;
        try {
            dosya=new File("hastaBilgileri.txt");

            if(!dosya.exists())
                dosya.createNewFile();

            fw = new FileWriter(dosya);
            for (String s : list) {
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


