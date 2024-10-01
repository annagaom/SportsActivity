# Sports Time Tracker

## Projektin kuvaus
**Sports Time Tracker** on yksinkertainen Java-sovellus, joka mahdollistaa käyttäjien kirjata viikoittaisia urheilutoimintoja, tarkastella kirjattuja aktiviteetteja ja laskea viikon aikana liikuntaan käytetyn kokonaisajan. Sovellus käyttää komentorivikäyttöliittymää ja tallentaa urheilusuorituksia yksinkertaiseen tietorakenteeseen.

## Ominaisuudet
- Kirjaa uusi urheilutoiminto (nimi ja kesto minuutteina).
- Näyttää kaikki tallennetut urheilutoiminnot.
- Laskee viikon aikana liikuntaan käytetyn kokonaisajan.
- Helppokäyttöinen komentorivikäyttöliittymä.

## Teknologiat
- **Java 11**: Sovelluksen toteuttamiseen.
- **JUnit 5**: Sovelluksen yksikkötestaukseen.
- **Maven**: Rakennustyökaluna.
- **Docker**: Sovelluksen kontittamiseen.
- **Jenkins**: Jatkuvaan integrointiin ja rakentamiseen.
- **Git**: Versionhallintaan.
- **UTM (Virtuaalikone)**: asennetaan Docker ja run the Docker container.

- **Asennusohjeet**: Ohjeet, kuinka sovellus voidaan suorittaa paikallisesti, Dockerilla ja Linux-virtuaalikoneessa.

- 
##Projektin rakenne

├── Dockerfile            # Docker-kuvan rakentamiseen
├── README.md             # Tämä tiedosto
├── pom.xml               # Mavenin konfiguraatiotiedosto
├── src
│   ├── main
│   │   └── java
│   │       └── SportsTimeTracker.java     # Sovelluksen pääluokka
│   └── test
│       └── java
│           └── SportsTimeTrackerTest.java # Yksikkötestit
└── target                # Käännetyt tiedostot ja testiraportit

##Lisenssi


### Selityksiä:
- **Projektin kuvaus**: Kerrotaan sovelluksen tarkoituksesta ja pääominaisuuksista.
- 

- **Testaus**: Kuinka testit suoritetaan ja missä testikattavuusraportti sijaitsee.
- **Jatkuva integrointi**: Määritelty, että Jenkins-pipeline on käytössä ja mitä se tekee.
- **Projektin rakenne**: Yleiskuva tiedostorakenteesta ja kunkin tiedoston tarkoituksesta.
- **Haasteet ja oppimiskokemukset**: Lyhyt raportti haasteista ja mitä projektin aikana opittiin.






  


