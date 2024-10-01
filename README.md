# Sports Time Tracker

## Projektin kuvaus
**Sports Time Tracker** on yksinkertainen Java-sovellus, joka mahdollistaa käyttäjien kirjata viikoittaisia urheilutoimintoja, tarkastella kirjattuja aktiviteetteja ja laskea viikon aikana liikuntaan käytetyn kokonaisajan. Sovellus käyttää komentorivikäyttöliittymää ja tallentaa urheilusuorituksia yksinkertaiseen tietorakenteeseen.

## Ominaisuudet
- Kirjaa uusi urheilutoiminto (nimi ja kesto minuutteina).
- Näyttää kaikki tallennetut urheilutoiminnot.
- Laskee viikon aikana liikuntaan käytetyn kokonaisajan.
- Helppokäyttöinen komentorivikäyttöliittymä.

## Teknologiat
- **Maven**: Rakennustyökaluna.
- **Docker**: Sovelluksen kontittamiseen.
- **Jenkins**: Jatkuvaan integrointiin ja rakentamiseen.
- **Git**: Versionhallintaan.
- **UTM (Virtuaalikone)**: asennetaan Docker ja run the Docker container.

## Projektin rakenne
```
├── Dockerfile                   # Docker-kuvan rakentamiseen**
├── README.md                    # Tämä tiedosto**
├── pom.xml                      # Mavenin konfiguraatiotiedosto**
├── src
│   ├── main
│   │   └── java
│   │       └── SportsTimeTracker.java      # Sovelluksen pääluokka
│   └── test
│       └── java
│           └── SportsTimeTrackerTest.java  # Yksikkötestit
└── target                       # Käännetyt tiedostot ja testiraportit
```
## Asennusohjeet
**Ohjeet, kuinka sovellus voidaan suorittaa paikallisesti, Dockerilla ja Linux-virtuaalikoneessa.**
1. **Luo uusi projekti `SportsActivity` and `SportsActivityjaTest`.**
**Lisää ``Dockerfile`**
```

# Use an official Maven image as a parent image
FROM maven:latest

# Set metadata information
LABEL authors="anna"

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml /app/

# Copy the entire project to the container
COPY . /app/

# Package your application
RUN mvn package

# Run the main class (assuming your application has a main class)
CMD ["java", "-jar", "target/sportsActivity.jar"]

```

2. **Lisää seuraavat koodit pom.xml**
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
3. **Execute maven goal/ run: mavn install to luoda target kansio.**
4. **Push the repository to your GitHub account.**
5. **Luo uusi repository `SportsActivity` docker hub:ssa**
6. **Set up a Jenkins server **
7. **Create a new Jenkins pipeline job.**
* Create a Jenkins pipeline:*
**1. Create uusi item-> lisää Definition, valitse  Pipeline script lisää koodit:**
```
   pipeline {
    agent any

    environment {
        DOCKERHUB_REPO = 'annagaom/sportsactivity'    // Docker Hub repository
        DOCKER_IMAGE_TAG = 'latest'          // Docker image tag
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/annagaom/SportsActivity.git' // Change to your Git repository
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // Adding Docker's path to the environment
                    withEnv(["PATH=/usr/local/bin:/usr/bin:/bin"]) {
                        docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                    }
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    withEnv(["PATH=/usr/local/bin:/usr/bin:/bin"]) { // Ensure correct PATH is used
                        withCredentials([usernamePassword(credentialsId: 'docker_credentials', // Change to your credential ID
                                                         usernameVariable: 'DOCKER_USER', 
                                                         passwordVariable: 'DOCKER_PASS')]) {
                            sh """
                                docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}
                                docker build -t ${DOCKER_USER}/sportsactivity:latest .
                                docker push ${DOCKER_USER}/sportsactivity:latest
                                docker logout
                            """
                        }
                    }
                }
            }
        }
    }
}
   ```
**2. Build now**
**Creates a Docker image of the application and push it to Doker hub**

8. **Asentaa UTM(virtuaalikone box mac:lle)**
8.1.**Creat a new Virtual Machine**
8.2. **Install Docker on the Linux VM.**
8.3. **Pull your Docker image from Docker Hub**
8.4. **Run the Docker container**








  


