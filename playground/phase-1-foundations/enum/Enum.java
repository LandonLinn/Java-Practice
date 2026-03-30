enum Status {
    LOADING("loading..."),
    FAILED("process failed."),
    SUCCESS("Completed.");

    private String state;

    private Status(String state) {
        this.state = state;
    }

    public String getStatus() {
        return state;
    }
}

public class Enum {
    public static void main(String[] args) {
        Status status = Status.LOADING;
        System.out.println(status.getStatus());
    }
}
