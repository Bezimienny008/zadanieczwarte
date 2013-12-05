class Historyczna extends Ksiazka
{
    String opis;
    String okres;
    String realizm;
    
    public Historyczna (String tytul)
    {
        super(tytul);
        okres="Nie okreslono.";
        opis="Nie dodano.";
        realizm="Nie okreslono.";
    }
    
    public Historyczna (String tytul, String okres, String realizm, String opis)
    {
        super(tytul);
        this.okres=okres;
        this.realizm=realizm;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Historyczna";
    }
    
    public String dajOpis()
    {
        return "Powieść umiejscowiona jest w okresie " + okres + ". Wiarygodnosc i rzetelnosc zaprezentowanych faktow jest " +realizm + ". Opisuje"+ opis;
    }
}