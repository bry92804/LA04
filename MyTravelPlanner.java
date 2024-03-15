package travelplanner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class MyTravelPlanner {

    // Schedule constants
    private static final LocalTime WEEKDAY_FIRST_TRAIN_TIME = LocalTime.of(6, 0);
    private static final LocalTime WEEKDAY_LAST_TRAIN_TIME = LocalTime.of(23, 0);
    private static final LocalTime WEEKEND_FIRST_TRAIN_TIME = LocalTime.of(10, 0);
    private static final LocalTime WEEKEND_LAST_TRAIN_TIME = LocalTime.of(22, 0);
    private static final int TRAIN_INTERVAL_WEEKDAY_MINUTES = 30;
    private static final int TRAIN_INTERVAL_WEEKEND_MINUTES = 120;
    private static final int DRIVE_TIME_MINUTES = 60;

    public String getPlan(LocalDate date, String weather, LocalTime firstAppointment, LocalTime lastAppointment) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (shouldCancelAppointments(weather)) {
            return "Please cancel or reschedule your appointments on " + date.toString() + ".";
        } else if (shouldDrive(weather)) {
            return "Please drive on " + date.toString() + ", and leave the house at " + firstAppointment.toString() + ".";
        } else {
            LocalTime recommendedTrainToCity;
            LocalTime recommendedTrainToSuburbs;
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                recommendedTrainToCity = findNextTrainTime(WEEKEND_FIRST_TRAIN_TIME, date, firstAppointment);
                recommendedTrainToSuburbs = findNextTrainTime(WEEKEND_LAST_TRAIN_TIME, date, lastAppointment);
            } else {
                recommendedTrainToCity = findNextTrainTime(WEEKDAY_FIRST_TRAIN_TIME, date, firstAppointment);
                recommendedTrainToSuburbs = findNextTrainTime(WEEKDAY_LAST_TRAIN_TIME, date, lastAppointment);
            }
            return "Please take the " + recommendedTrainToCity.toString() + " train to go to the city, and " +
                    recommendedTrainToSuburbs.toString() + " train to get back home on " + date.toString() + ".";
        }
    }

    private LocalTime findNextTrainTime(LocalTime startTime, LocalDate date, LocalTime appointmentTime) {
        int interval = getTrainInterval(date.getDayOfWeek());
        LocalTime nextTrainTime = startTime;
        while (nextTrainTime.isBefore(appointmentTime)) {
            nextTrainTime = nextTrainTime.plusMinutes(interval);
        }
        return nextTrainTime;
    }

    private int getTrainInterval(DayOfWeek dayOfWeek) {
        return (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) ?
                TRAIN_INTERVAL_WEEKEND_MINUTES : TRAIN_INTERVAL_WEEKDAY_MINUTES;
    }

    private boolean shouldCancelAppointments(String weather) {
        return weather.equals("Rainy") || weather.equals("Snowy");
    }

    private boolean shouldDrive(String weather) {
        return shouldCancelAppointments(weather);
    }

    public static void main(String[] args) {
        // Test the class
        MyTravelPlanner planner = new MyTravelPlanner();

	public static int getDriveTimeMinutes() {
		return DRIVE_TIME_MINUTES;
	}
}
