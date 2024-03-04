import java.util.Date;
import java.text.SimpleDateFormat;
public class sonKullanmaTarihi extends urunAdedi
{

    public  void tarih( )
        {
            Date bugununTarihi = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try{
                Date stk = simpleDateFormat.parse("2025-11-23");

                if ( bugununTarihi.getTime() > stk.getTime() ) {

                    System.out.println("Son Kullanma Tarihi Geçen Ürünler Depodan Eksiltiliyor...");
                    depodakiUrunSayisi--;
                    System.out.println("Depoda kalan ürün sayısı:"+ depodakiUrunSayisi);
                }

                else if ( bugununTarihi.getTime()< stk.getTime() ) {
                    System.out.println("Son Kullanma Tarihi Geçen Ürün Bulunmamaktadır.");
                }

            }
            catch( Exception ex )
            {
                System.out.println("Verilen tarih son kullanma tarihine eşittir .. ");
            }
            finally
            {
                System.out.println("Karşılaştırma Bitti...");
            }

        }
}

