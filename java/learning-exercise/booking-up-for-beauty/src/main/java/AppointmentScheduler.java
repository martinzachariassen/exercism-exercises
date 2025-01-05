import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    private static final String DATE_PATTERN = "MM/dd/yyyy HH:mm:ss";
    private static final String TIME_PATTERN_AM_PM = "h:mm a";
    private static final int ANNIVERSARY_MONTH = 9; // September
    private static final int ANNIVERSARY_DAY = 15;

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hours = appointmentDate.getHour();
        return hours >= 12 && hours < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String day = appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String month = appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        int dayOfMonth = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIME_PATTERN_AM_PM);
        String time = appointmentDate.format(timeFormatter);

        return String.format("You have an appointment on %s, %s %d, %d, at %s.", day, month, dayOfMonth, year, time);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), ANNIVERSARY_MONTH, ANNIVERSARY_DAY);
    }
}
