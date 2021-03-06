class Biblioteka
{
    String adres;
    Ksiazka zbior [] = new Ksiazka [100];
    int iloscksiag;
    public  Biblioteka ( String adres )
    {
        this.adres=adres;
    }
    public String wypiszAdres()
        {
            return adres;
        }
    public static void wypiszGodzinyOtwarcia()
        {
           System.out.println ("Biblioteki sa otwarte codziennie od 9:00 do 17:00.");
        }
    public void dodajKsiazke (Ksiazka tytul)
       {
           if (iloscksiag==100)
           {
                System.out.println ("Mamy już komplet ksiazek, przepraszamy.");
                return;
           }
           zbior[iloscksiag]=tytul;
           iloscksiag++;
       }
    public void wypozyczKsiazke (String tytul)
    {
            boolean jest=false;
            for (int i=0; i<iloscksiag; i++)
                {    
                            if (tytul.equals(zbior[i].dajTytul()))
                            {
                                jest=true;
                                if(!zbior[i].czyWypozyczona())
                                {
                                    System.out.println( "Udało sie wypozyczyc Ksiazke" + zbior[i].dajTytul());
                                    zbior[i].wypozycz();
                                    return;
                                }   
                            }
                }
            if(jest)
            {
                 System.out.println( "Przykro nam, ksiazka jest juz wypozyczona.");
                 return;
            }
            System.out.println( "Przykro nam, nie mamy takiej ksiazki.");
    }
    public void wypiszDostepneKsiazki ()
        {
            boolean czyjest=false;
            for (int i=0; i<iloscksiag; i++)
            {               
                if(!zbior[i].czyWypozyczona())
                      {
                             System.out.println(zbior[i].dajTytul());
                             System.out.println("\tGatunek: " + zbior[i].dajRodzaj());
                             System.out.println("\tDane: " + zbior[i].dajOpis());                          
                             czyjest=true;
                      } 
                      
            }
            if (!czyjest)
            {
                System.out.println("Brak ksiazek w bibliotece.");
            }
        }
    public void oddajKsiazke(String tytul)
    {
        boolean jest=false;
        for(int i=0; i<iloscksiag; i++)
        {
            if(tytul.equals(zbior[i].dajTytul()) && zbior[i].czyWypozyczona())
            {
                zbior[i].oddaj();
                return;
             }
        }
    }
    //Dodaj implementacje odpowiednich metod
    public static void main( String[] argumenty )
    {
        //Stworz dwie biblioteki
        Biblioteka pierwsza = new Biblioteka( "Armi Krajowej 24" );
        Biblioteka druga = new Biblioteka( "Plac Grunwaldzki 6" );

        //Dodaj cztery ksiazki do pierwszej biblioteki
        pierwsza.dodajKsiazke( new Epopeja( "Pan Tadeusz", "ostatni zajazd szlachty na Litwie", "Epopeja narodowa z elementami gawedy szlacheckiej. Rozgrywa sie za czasow napoleonskich. Lektura szkolna.") );
        pierwsza.dodajKsiazke( new Fantastyka( "Gra o Tron","Robb Stark", "tytul rodowy",": nie dodano", "umiarkowana.", " Obowiazkowa lektura dla wszystkich fanow literatury fantasy." ) );
        pierwsza.dodajKsiazke( new Kryminal( "Tozsamosc Bourne'a","wywiad", "Pierwsza czesc trylogii opowiadajacej o czlowieku znanym jako Jason Bourne. Cierpiacy na amnestie Bourne probuje odkryc swa przeszlosc i dowiedziec sie kto, i dlaczego, chce go zabic." ) );
        pierwsza.dodajKsiazke( new Naukowa( "Analiza Matematyczna", "matematyka.", "analiza matematyczna.", "pozycja obowiązkowa na politechnice." ) );
        //Wypisz godziny urzedowania bibliotek
        System.out.println( "Godziny otwarcia bibliotek ");
        wypiszGodzinyOtwarcia();
        System.out.println(); //pusta linijka

        System.out.println( "Adresy bibliotek " );
        System.out.println (pierwsza.wypiszAdres());
        System.out.println (druga.wypiszAdres());
        System.out.println(); //pusta linijka

        //wypozycz Pana Tadeusza z obu bibliotek
        System.out.println( "Wypozyczanie Pana Tadeusza" );
        pierwsza.wypozyczKsiazke( "Pan Tadeusz" );

        pierwsza.wypozyczKsiazke( "Pan Tadeusz" ); //sprobuj jeszcze raz

        druga.wypozyczKsiazke( "Pan Tadeusz" );

        System.out.println(); //pusta linijka

        //Wypisz dostepne tytuly w obu bibliotekach
        System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
        pierwsza.wypiszDostepneKsiazki();
        System.out.println(); //pusta linijka
        System.out.println( "Ksiazki z drugiej biblioteki" );
        druga.wypiszDostepneKsiazki();
        System.out.println();

        // zwroc Pana Tadeusza do biblioteki
        System.out.println( "Zwrot Pana Tadeusza" );
        pierwsza.oddajKsiazke( "Pan Tadeusz" );
        System.out.println();

        // Wypisz tytuly dostepne w pierwszej bibliotece
        System.out.println( "Ksiazki dostepne w pierwszej bibliotece" );
        pierwsza.wypiszDostepneKsiazki();
    }
}
        