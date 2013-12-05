class Test
{
    String adres;
    
    public  Biblioteka (String adres)
    {
        this.adres=adres;
    }
	//Dodaj implementacje odpowiednich metod
	public static void main( String[] argumenty )
	{
		//Stworz dwie biblioteki
		Biblioteka pierwsza = new Biblioteka( "Armi Krajowej 24" );
		Biblioteka druga = new Biblioteka( "Plac Grunwaldzki 6" );

		//Wypisz godziny urzedowania bibliotek
		System.out.println( "Godziny otwarcia bibliotek ");
		wypiszGodzinyOtwarcia();
		System.out.println(); //pusta linijka

		System.out.println( "Adresy bibliotek " );
		pierwsza.wypiszAdres();
		druga.wypiszAdres();
		System.out.println(); //pusta linijka

	}
}
		
