package com.company;

public class Main {
// Zadanie 13-14.04
    public static void main(String[] args) {
        class Uczeń{
            String Imię;
            String Nazwisko;
            String Pesel;
            void Ustaw_Imię(String newImię){
                Imię = newImię;
            }
            void Ustaw_nazwisko(String newNazwisko){
                Nazwisko = newNazwisko;
            }
            void Ustaw_pesel(String newPesel){
                Pesel = newPesel;
            }
        }
        class UczeńSzkoły extends Uczeń{
            String Nazwa_szkoły;
            void Ustaw_szkołę(String newSzkoła){
                Nazwa_szkoły = newSzkoła;
            }
        }
        class UczeńKlasy extends UczeńSzkoły{
            String klasa;
            void Ustaw_klasę(String newklasa){
                klasa = newklasa;
            }
        }
        String s;
        byte [] buf = new byte[255];
        UczeńKlasy newUczen = new UczeńKlasy();

        System.out.println("Podaj imię ucznia: ");
        try {
            System.in.read(buf);
            s = new String(buf);
            s = s.trim();
            newUczen.Ustaw_Imię(s);
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
        System.out.println("Podaj nazwisko ucznia: ");
        try {
            System.in.read(buf);
            s = new String(buf);
            s = s.trim();
            newUczen.Ustaw_nazwisko(s);
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
        System.out.println("Podaj pesel ucznia: ");
        try {
            System.in.read(buf);
            s = new String(buf);
            s = s.trim();
            newUczen.Ustaw_pesel(s);
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
        System.out.println("Podaj szkołę ucznia: ");
        try {
            System.in.read(buf);
            s = new String(buf);
            s = s.trim();
            newUczen.Ustaw_szkołę(s);
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
        System.out.println("Podaj klasę ucznia: ");
        try {
            System.in.read(buf);
            s = new String(buf);
            s = s.trim();
            newUczen.Ustaw_klasę(s);
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
    }
}
