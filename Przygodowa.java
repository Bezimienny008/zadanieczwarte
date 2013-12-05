class Przygodowa extends Ksiazka
{
    String opis;
    String cel;
    String wrog;
    
    public Przygodowa (String tytul)
    {
        super(tytul);
        cel="Nie okreslono.";
        opis="Nie dodano.";
        wrog="Nie okreslono.";
    }
    
    public Przygodowa (String tytul, String cel, String wrog, String opis)
    {
        super(tytul);
        this.cel=cel;
        this.wrog=wrog;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Przygodowa";
    }
    
    public String dajOpis()
    {
        return "Powieść opowiada o " + opis + ". Glownym celem bohaterow jest: " +cel + ". Ich najwiekszym przeciwnikiem jest "+ wrog + " .";
    }
}