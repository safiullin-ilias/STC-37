package HW_9;

public class NumberAndStringProcessor {
    String[] Strings;
    int[] Numbers;

    public NumberAndStringProcessor(String[] strings) {
        Strings = strings;
        Numbers = new int[0];
    }

    public NumberAndStringProcessor(int[] numbers) {
        Strings = new String[0];
        Numbers = numbers;
    }
    
    public NumberAndStringProcessor(int[] numbers, String[] strings) {
        Strings = strings;
        Numbers = numbers;
    }

    public int[] REVERSE_INTS() {
        return process_ints((numb) -> {
            int new_number = 0;
            while (numb > 0) {
                int t = numb % 10;
                numb /= 10;
                new_number = new_number * 10 + t;
            }
            return new_number;
        });
    }

    public String[] REVERSE_STRINGS() {
        return process_strings((str) -> {
            String new_string = "";
            for (int i = str.length() - 1; i >= 0; --i)
                new_string += str.charAt(i);
            return new_string;
        });
    }

    public int[] process_ints(INumberProcess function) {
        int[] data = new int[Numbers.length];
        for (int i = 0; i< Numbers.length; i++)
            data[i] = function.process(Numbers[i]);
        return data;
    }

    public String[] process_strings(IStringProcess function) {
        String[] data = new String[Strings.length];
        for (int i = 0; i< Strings.length; i++)
            data[i] = function.process(Strings[i]);
        return data;
    }
}
