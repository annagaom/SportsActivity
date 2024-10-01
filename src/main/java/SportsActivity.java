// SportsTimeTracker.java
import java.util.ArrayList;
import java.util.Scanner;

class SportsActivity {
    String name;
    int duration; // Kesto minuuteissa

    public SportsActivity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + ": " + duration + " minuuttia";
    }
}


