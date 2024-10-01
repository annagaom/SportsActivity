// SportsTimeTracker.java

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


