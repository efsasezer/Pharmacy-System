import java.text.DateFormat;

public class urun
{
    protected final int fiyat;
    protected final String urunAdi;
    protected final String urunTipi;
    protected final int urunSayisi;

    public urun(int fiyat, String urunAdi, String urunTipi,int urunSayisi)
    {
        this.fiyat = fiyat;
        this.urunAdi = urunAdi;
        this.urunTipi = urunTipi;
        this.urunSayisi=urunSayisi;
    }
    public int getFiyat ()
    {
        return fiyat;
    }
    public String getUrunAdi ()
    {
        return urunAdi;
    }
    public String getUrunTipi ()
    {
        return urunTipi;
    }
    public int getUrunSayisi ()
    {
        return urunSayisi;
    }

}