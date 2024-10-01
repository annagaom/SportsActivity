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

- ## Asennusohjeet
- Ohjeet, kuinka sovellus voidaan suorittaa paikallisesti, Dockerilla ja Linux-virtuaalikoneessa.

pom.xml:
```
<dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <finalName>sportsActivity</finalName>
        <plugins>
            <!-- Compiler Plugin for setting the Java version -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.13.0</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>

            <!-- JAR Plugin for configuring the manifest file -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.4.1</version>
                <configuration>
                    <includes>
                        <include>**/*.class</include>
                    </includes>
                </configuration>
            </plugin>

            <!-- JaCoCo Plugin for code coverage -->
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.12</version>
                <executions>
                    <execution>
                        <id>jacoco-initialize</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>jacoco-report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

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






  


