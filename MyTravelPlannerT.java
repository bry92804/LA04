package travelplanner;

import  org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
 
public class MyTravelPlannerT {

    @Test
    public void testWeekdayBeforeHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 25, 9, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 25, 8, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    private void assertEquals(LocalDateTime expected, LocalDateTime calculateTrainDepartureTime) {
		
	}

	@Test
    public void testWeekdayAfterHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 25, 10, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 25, 10, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendBeforeHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 9, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 8, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendAfterHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 10, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 10, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayBeforeSixAM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 5, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 4, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayAfterTenPM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 22, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 22, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayAfterElevenPM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 23, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 22, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendAfterTenPM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 22, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 22, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendAfterElevenPM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 23, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 22, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendBeforeTenAM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 9, 0);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 8, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayAfterHalfPast() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 11, 45);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 10, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendAfterHalfPast() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 29, 11, 45);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 29, 10, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayOnHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 27, 12, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 27, 12, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendOnHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 15, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 14, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayBeforeSixAMOnHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 5, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 28, 4, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendAfterTenPMOnHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 22, 30);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 22, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayAfterHalfPastOnHalfHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 11, 45);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 10, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekendOnEvenHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 16, 0);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 30, 14, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayOnEvenHour() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 14, 0);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 26, 14, 0);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }

    @Test
    public void testWeekdayAfterSixPM() {
        LocalDateTime appointmentDateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 27, 18, 0);
        LocalDateTime expected = LocalDateTime.of(2023, Month.SEPTEMBER, 27, 17, 30);
        assertEquals(expected, MyTravelPlanner.calculateTrainDepartureTime(appointmentDateTime));
    }
}