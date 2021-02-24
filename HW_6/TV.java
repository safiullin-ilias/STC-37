package HW_6;

public class TV {
    
    private Channel[] channels = new Channel[0];

    public void addChannel(Channel channel) {
        int l = channels.length;
        Channel[] _channels = new Channel[l + 1];

        for (int i = 0; i < l; i++) {
            _channels[i] = channels[i];
        }

        _channels[l] = channel;
        channels = _channels;
    }

    public void addChannel(String channelName) {
        addChannel(new Channel(channelName));
    }

    public Program selectChannel(int number) {
        if (number < 0 || number >= channels.length) {
            System.out.println("Такой кнопки нет");
            return null;
        }
        System.out.println("Выбран канал " + channels[number].getName());
        return channels[number].getRandomProgram();
    }
}
