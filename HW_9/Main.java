package HW_9;

public class Main {
    public static void main(String[] args) {
        NumberProcess NP = new NumberProcess();
        StringProcess SP = new StringProcess();
        System.out.println(NP.REVERSE(51597));
        System.out.println(NP.DELETE_NULLS(301052500));
        System.out.println(NP.NE4ETTOLOW(165123165));

        System.out.println(SP.REVERSE("Tut Byil Ilias"));
        System.out.println(SP.DELETE_DIGITS("On rodilsya v 1994"));
        System.out.println(SP.LOW_TO_UPPER("LLltAkeTnYI nabor symbolov"));

        
    }
}
