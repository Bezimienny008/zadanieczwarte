class Podroznicza extends Ksiazka
{
    String opis;
    String transp;
    String regiony;
    
    public Podroznicza (String tytul)
    {
        super(tytul);
        transp="Nie okreslono.";
        opis="Nie dodano.";
        regiony="Nie okreslono.";
    }
    
    public Podroznicza (String tytul, String transp, String regiony, String opis)
    {
        super(tytul);
        this.transp=transp;
        this.regiony=regiony;
        this.opis=opis;
    }
    
    public String dajRodzaj()
    {
        return "Podroznicza";
    }
    
    public String dajOpis()
    {
        return "Glownym srodkiem transportu jest " + transp + ". Regiony, ktore odwiedza bohater, to: " +regiony + ". Opisuje"+ opis;
    }
}