class Fantastyka extends Ksiazka
{
    String opis;
    String imie;
    String boh;
    String fantasy;
    String uniw;
    public Fantastyka (String tytul)
    {
        super(tytul);
        imie="Nie dodano.";
        boh="Nie okreslono.";
        uniw="Nie okreslono.";
        fantasy="Nie dodano.";
        opis="Nie dodano.";
    }
    
    public Fantastyka (String tytul, String imie, String boh, String uniw, String fantasy, String opis)
    {
        super(tytul);
        this.imie=imie;
        this.boh=boh;
        this.uniw=uniw;
        this.fantasy=fantasy;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Fantastyka";
    }
    
    public String dajOpis()
    {
        return "Imie bohatera to "+ imie+ ". Od innych bohaterow wyroznia go " + boh + ". Uniwersum, w ktorym rozgrywa sie powiesc to " + uniw + ". Ilosc wystepujacej magii w swiecie (czarow, stworow, istot) jest: " +fantasy  + opis;
    }
}