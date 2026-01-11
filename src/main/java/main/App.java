// src/main/java/main/App.java
// Kati Liukkonen
// Raketti-testiohjelma ohjevideoiden mukaan

// package main; molempien tiedostojen alussa tarkoittaa, 
// että molemmat luokat kuuluvat samaan pakettiin nimeltä main
// tämä tulee tiedostorakenteesta src/main/java/main/ ja molemmat sijaitsevat samassa kansiossa
// Kun luodaan tiedosto Rocket.java, määritellään samalla luokka Rocket.


package main;


public class App 
{
    public static void main( String[] args )
    {
        // System on luokka, out on olio ja println on metodi
        System.out.println("Raketti-testiohjelma alkaa.");

    // Kun luokka Rocket on määritelty omassa tiedostossaan Rocket.java,
    // luodaan täällä Rocket-olio 
    // Tehdään uusi muuttuja, jonka tyyppi on Rocket ja sille annetaan nimi,
    // tässä esimerkissä rocket
    // Luokka (Rocket) ona aina isolla alkukirjaimella 
    // ja muuttuja (rocket) pienellä alkukirjaimella

    Rocket rocket = new Rocket();

    // Kutsutaan metodeja, jotka on määritelty Rocket-luokassa tiedostossa Rocket.java

    rocket.fly();
    rocket.printSpecs();

    // Tehdään uusi Rocket-olio ja kutsutaan sen fly-metodia
    Rocket rocket2 = new Rocket();
    rocket2.fly();
    }   

}
