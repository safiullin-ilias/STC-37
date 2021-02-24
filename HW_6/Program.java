package HW_6;

public class Program {
    private String name;

    public Program(String programName) {
        name = programName;
    }
    
    public Program() {
        name = "";
    }

    public String getName() {
        return name;
    }
    public void setName(String programName) {
        name = programName;
    }
}
