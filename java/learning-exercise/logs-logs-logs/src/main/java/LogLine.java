public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevel = logLine.substring(1, 4);

        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String logLevel = logLine.substring(1, 4);

        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE.getValue() + ":" + logLine.substring(7);
            case "DBG" -> LogLevel.DEBUG.getValue() + ":" + logLine.substring(7);
            case "INF" -> LogLevel.INFO.getValue() + ":" + logLine.substring(7);
            case "WRN" -> LogLevel.WARNING.getValue() + ":" + logLine.substring(7);
            case "ERR" -> LogLevel.ERROR.getValue() + ":" + logLine.substring(7);
            case "FTL" -> LogLevel.FATAL.getValue() + ":" + logLine.substring(7);
            default -> LogLevel.UNKNOWN.getValue() + ":" + logLine.substring(7);
        };
    }
}
