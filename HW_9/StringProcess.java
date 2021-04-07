package HW_9;

public class StringProcess {
    public String REVERSE(String string) {
        return process(string, (str) -> {
            String new_string = "";
            for (int i = str.length() - 1; i >= 0; --i)
                new_string += str.charAt(i);
            return new_string;
        });
    }

    public String DELETE_DIGITS(String string) {
        return process(string, (str) -> {
            String new_string = "";
            for (int i = 0; i < str.length(); ++i)
                if (!isDigit(str.charAt(i)))
                    new_string += str.charAt(i);
            return new_string;
        });
    }

    public String LOW_TO_UPPER(String string) {
        return process(string, (str) -> {
            String new_string = "";
            for (int i = 0; i < str.length(); ++i)
                new_string += Character.isLowerCase(str.charAt(i))
                    ? Character.toUpperCase(str.charAt(i))
                    : str.charAt(i);
            return new_string;
        });
    }

    public String process(String number, IStringProcess function) {
        return function.process(number);
    }

    private boolean isDigit(char charString) {
        try {
            Integer.parseInt(String.valueOf(charString));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
