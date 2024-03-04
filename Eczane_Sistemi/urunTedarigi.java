
public class urunTedarigi extends urunAdedi
{
       public void tedarikSorgulamasi()
       {
              super.satilanUrun();
              if (super.gidecekUrun == 0) //Henüz ürün satılmadıysa ve tedariğe gerek yok ise
              {
                     System.out.println("Henüz satış işlemi gerçekleştirilmedi.");
              }

              else  //Satılan ürünler var ise

              System.out.println("En son satılan ve yenilerinin tedarik edilmesi gereken ürün adedi bilgisi : ");
              System.out.println(super.gidecekUrun);

       }
}