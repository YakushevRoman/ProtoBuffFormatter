public enum LogType {
    SENDER("send message "),
    RECEIVER("receive message "),
    UI("ui ");

    private final String log;

    LogType(String log){
        this.log = log;
    }

    public String getLog() {
        return log;
    }
}
