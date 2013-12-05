class Naukowa extends Ksiazka
{
    String opis;
    String nauka;
    String dziedzina;
    public Naukowa (String tytul)
    {
        super(tytul);
        nauka="Nieokreślono.";
        dziedzina="Nieokreślono.";
        opis="Nie dodano.";
    }
    
    public Naukowa (String tytul, String nauka, String dziedzina, String opis)
    {
        super(tytul);
        this.nauka=nauka;
        this.dziedzina=dziedzina;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Ksiazka Naukowa";
    }
    
    public String dajOpis()
    {
        return "Nauka: " + nauka + " Dzedzina: " + dziedzina + " Opis: " + opis;
    }
}