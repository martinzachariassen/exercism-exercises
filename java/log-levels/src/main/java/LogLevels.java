public class LogLevels {
    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":") + 2);
        return cleanString(message);
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return cleanString(logLevel).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }

    private static String cleanString(String string) {
        return string.replaceAll("[\\t\\r\\n]", "").trim();
    }
}
