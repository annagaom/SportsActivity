import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SportsActivityTest {

    private ArrayList<SportsActivity> activities;

    @BeforeEach
    public void setUp() {
        // Tämä ajetaan ennen jokaista testiä
        activities = new ArrayList<>();
    }

    @Test
    public void testAddActivity() {
        // Lisää aktiviteetti ja tarkista, että se lisätään oikein
        SportsActivity activity = new SportsActivity("Juoksu", 30);
        activities.add(activity);

        assertEquals(1, activities.size(), "Aktiviteettien määrä on väärä.");
        assertEquals("Juoksu", activities.get(0).name, "Aktiviteetin nimi on väärä.");
        assertEquals(30, activities.get(0).duration, "Aktiviteetin kesto on väärä.");
    }

    @Test
    public void testTotalTimeCalculation() {
        // Lisää aktiviteetteja ja tarkista, että kokonaisaika lasketaan oikein
        activities.add(new SportsActivity("Juoksu", 30));
        activities.add(new SportsActivity("Pyöräily", 45));

        int totalTime = activities.stream().mapToInt(activity -> activity.duration).sum();

        assertEquals(75, totalTime, "Kokonaisaika on väärä.");
    }

    @Test
    public void testEmptyActivityList() {
        // Tarkista, että tyhjä aktiviteettilista toimii oikein
        assertTrue(activities.isEmpty(), "Aktiviteettilistan pitäisi olla tyhjä.");
    }
}
