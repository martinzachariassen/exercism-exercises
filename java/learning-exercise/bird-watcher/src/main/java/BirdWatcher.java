import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        return isDataAvailable() ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
        if (isDataAvailable()) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(count -> count == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        return Arrays.stream(birdsPerDay, 0, daysToCount).sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(count -> count >= 5).count();
    }

    private boolean isDataAvailable() {
        return birdsPerDay.length > 0;
    }
}
