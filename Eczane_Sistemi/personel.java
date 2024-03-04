public abstract class personel
{
    protected String personelAdi;
    protected String personelSoyadi;
    protected double personelMaasi;
    protected String personelMail;
    protected int personelYasi;

    public abstract void adVer(String personelAdi);
    public abstract void soyadVer(String personelSoyadi);
    public abstract void maasVer(int personelMaasi);
    public abstract void mailVer(String personelMail);
    public abstract void yasVer(int personelYasi);

    public void yeniPersonel (String personelAdi,String personelSoyadi,String personelMail,int personelYasi)
    {
        System.out.println("Yeni eleman : " +personelAdi + " " +personelSoyadi+ " " + personelMail + " " + personelYasi );
    }



}