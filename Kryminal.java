class Kryminal extends Ksiazka
{
    String opis;
    String wrog;
    public Kryminal (String tytul)
    {
        super(tytul);
        wrog="Nie zostal dodany.";
        opis="Nie dodano.";
    }
    
    public Kryminal (String tytul, String wrog, String opis)
    {
        super(tytul);
        this.wrog=wrog;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Kryminal";
    }
    
    public String dajOpis()
    {
        return opis +" Głownym wrogiem bohatera jest " +wrog +".";
    }
}