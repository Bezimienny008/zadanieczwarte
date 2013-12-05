class Biografia extends Ksiazka
{
    String opis;
    String czyja;
    String realizm;
    
    public Biografia (String tytul)
    {
        super(tytul);
        czyja="Nie dodano.";
        opis="Nie dodano.";
        realizm="Nie okreslono.";
    }
    
    public Biografia (String tytul, String czyja, String realizm, String opis)
    {
        super(tytul);
        this.czyja=czyja;
        this.realizm=realizm;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Biografia";
    }
    
    public String dajOpis()
    {
        return "Jest biografia " + czyja + ". Wiarygodnosc i rzetelnosc zaprezentowanych faktow jest " +realizm + ". Opisuje"+ opis;
    }
}