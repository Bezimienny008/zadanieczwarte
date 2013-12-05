class Ksiazka
{
    String tytul;
    boolean czyWypozyczona;

    public Ksiazka( String tytul )
    {
        this.tytul=tytul;
        czyWypozyczona=false;
    }

    public void wypozycz()
    {
        if (czyWypozyczona==false)
            czyWypozyczona=true;
    }
    
    public void oddaj()
    {
        if (czyWypozyczona==true)
            czyWypozyczona=false;
    }

    public boolean czyWypozyczona()
    {
        return czyWypozyczona;
    }

    public String dajTytul()
    {
        return tytul;
    }

    public String dajRodzaj()
    {
        return "";
    }

    public String dajOpis()
    {
        return "";
    }

    public static void main( String[] argumenty ) 
    {
        Ksiazka przykladowa = new Ksiazka( "Pan Tadeusz" );
        System.out.println( "Tytul: (powinno byc Pan Tadeusz) " + przykladowa.dajTytul() );
        System.out.println( "Czy wypozyczona (powinna byc false)? " + przykladowa.czyWypozyczona() );
        przykladowa.wypozycz();
        System.out.println( "Czy wypozyczona (powinno byc true)? " + przykladowa.czyWypozyczona() );
        przykladowa.oddaj();
        System.out.println( "Czy wypozyczona (powinno byc false)? " + przykladowa.czyWypozyczona() );   
    }

}