package HW_6;

public class RemoteController {
    private TV tv;
    public Program selectChannel(int number) {
        return tv.selectChannel(number);
    }
    public RemoteController(TV tv) {
        this.tv = tv;
    }
}
