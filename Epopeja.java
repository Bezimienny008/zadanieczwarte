class Epopeja extends Ksiazka
{
    String opis;
    String wydarzenie;
    
    public Epopeja (String tytul)
    {
        super(tytul);
        wydarzenie="Nie okreslono.";
        opis="Nie dodano.";
    }
    
    public Epopeja (String tytul, String wydarzenie, String opis)
    {
        super(tytul);
        this.wydarzenie=wydarzenie;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Epopeja";
    }
    
    public String dajOpis()
    {
        return "Powiesc prezentuje " + wydarzenie + ". " + opis;
    }
}