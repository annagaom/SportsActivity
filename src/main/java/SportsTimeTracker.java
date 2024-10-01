import java.util.ArrayList;
import java.util.Scanner;

public class SportsTimeTracker {
    private static ArrayList<SportsActivity> activities = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Lisää uusi aktiviteetti");
            System.out.println("2. Näytä kaikki aktiviteetit");
            System.out.println("3. Laske viikon kokonaisaika");
            System.out.println("4. Poistu");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Rivinvaihdon käsittely

            switch (choice) {
                case 1:
                    System.out.println("Anna aktiviteetin nimi:");
                    String name = scanner.nextLine();
                    System.out.println("Anna aktiviteetin kesto (minuuttia):");
                    int duration = scanner.nextInt();
                    activities.add(new SportsActivity(name, duration));
                    break;
                case 2:
                    for (SportsActivity activity : activities) {
                        System.out.println(activity);
                    }
                    break;
                case 3:
                    int totalTime = 0;
                    for (SportsActivity activity : activities) {
                        totalTime += activity.duration;
                    }
                    System.out.println("Viikon kokonaisaika: " + totalTime + " minuuttia");
                    break;
                case 4:
                    System.out.println("Ohjelma suljetaan.");
                    System.exit(0);
            }
        }
    }
}