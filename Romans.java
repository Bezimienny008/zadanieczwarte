class Romans extends Ksiazka
{
    String opis;
    String kochankowie;
    String bad;
    
    public Romans (String tytul)
    {
        super(tytul);
        kochankowie="Nie dodano.";
        opis="Nie dodano.";
        bad="Nie okreslono.";
    }
    
    public Romans (String tytul, String kochankowie, String bad, String opis)
    {
        super(tytul);
        this.kochankowie=kochankowie;
        this.bad=bad;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Romans";
    }
    
    public String dajOpis()
    {
        return "Glownymi bohaterami, o milosci ktorych opowiada powiesc sa " + kochankowie + ". Osoba chcaca im przeszkodzic jest " +bad + ". Opisuje"+ opis;
    }
}