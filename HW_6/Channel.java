package HW_6;

public class Channel {
    private String name;
    

    public Channel(String channelName) {
        name = channelName;
    }
    
    public Channel() {
        name = "";
    }

    
    public String getName() {
        return name;
    }
    public void setName(String channelName) {
        name = channelName;
    }

    public Program[] programs = new Program[0];;

    public void addProgram(Program program) {
        int l = programs.length;
        Program[] _programs = new Program[l + 1];

        for (int i = 0; i < l; i++) {
            _programs[i] = programs[i];
        }

        _programs[l] = program;
        programs = _programs;
    }

    public void addProgram(String programName) {
        addProgram(new Program(programName));
    }

    public Program getRandomProgram() {
        int l = programs.length;
        int index = (int)(Math.random() * l);
        return programs[index];
    }
}
