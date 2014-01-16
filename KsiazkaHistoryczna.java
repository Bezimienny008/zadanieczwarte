class KsiazkaHistoryczna extends Ksiazka
{
    String opis;
    String autor;
    String wydawnictwo;
    public KsiazkaHistoryczna (String tytul)
    {
        super(tytul);
        autor="Nieokreślono.";
        wydawnictwo="Nieokreślono.";
        opis="Nie dodano.";
    }
    
    public KsiazkaHistoryczna (String tytul, String autor, String wydawnictwo, String opis)
    {
        super(tytul);
        this.autor=autor;
        this.wydawnictwo=wydawnictwo;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Ksiazka Historyczna";
    }
    
    public String dajOpis()
    {
        return opis;
    }
    
        public String dajWyd()
    {
        return wydawnictwo;
    }
    
        public String dajAutora()
    {
        return autor;
    }
}