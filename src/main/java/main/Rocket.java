package main;

// Luokka Rocket määritellään tässä tiedostossa Rocket.java
// Luokka Rocket sisältää kolme attribuuttia eli jäsenmuuttujaa: name, mass ja height
// Sen jälkeen luokalle muodostetaan rakentaja, joka on julkinen (public) ja jolla on sama nimi kuin luokalla
// Rakentaja metodi, jolla ei ole palautusarvoa. Se määrittelee, miten luokan oliot alustetaan
// private tarkoittaa, että attribuutin arvoa ei voi muuttaa suoraan luokan ulkopuolelta

public class Rocket {
    private String name;
    private int mass;
    private int height;

    public Rocket() {
        name = "Falcon Heavy";
        mass = 100_000;
        height = 70;
    }

    // Annetaan raketille ominaisuuksia
    // Tässä esimerkissä laitetaan raketti lentämään ja kertomaan omat arvonsa.
    // Tehdään näille ominaisuuksille julkiset metodit, jotka eivät palauta mitään.

    public void fly() {
        System.out.println(name + " lentää avaruuteen.");
    }

    public void printSpecs() {
        System.out.println("*** " + name + " ***");
        System.out.println("Massa: " + mass + " kg");
        System.out.println("Korkeus: " + height + " m");
    }
}
