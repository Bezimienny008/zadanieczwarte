class Scifi extends Ksiazka
{
    String opis;
    String ziemia;
    String fantasy;
    String rok;
    
    public Scifi (String tytul)
    {
        super(tytul);
        ziemia="Nie okreslono.";
        opis="Nie dodano.";
        fantasy="Nie okreslono.";
        rok="Nie okreslono.";
    }
    
    public Scifi (String tytul, String ziemia, String fantasy, String rok, String opis)
    {
        super(tytul);
        this.ziemia=ziemia;
        this.fantasy=fantasy;
        this.rok=rok;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Science-Fiction";
    }
    
    public String dajOpis()
    {
        return "Powieść " + ziemia + " prezentuje przyszlosc ludzkosci. Rozgrywa sie w latach" + rok + ". Zgodnosc z obowiazujacymi prawami fizyki i przyrody jest " +fantasy + ". Opisuje"+ opis;
    }
}