package HW_9;

public class NumberProcess {

    public int REVERSE(int number) {
        return process(number, (numb) -> {
            int new_number = 0;
            while (numb > 0) {
                int t = numb % 10;
                numb /= 10;
                new_number = new_number * 10 + t;
            }
            return new_number;
        });
    }

    public int DELETE_NULLS(int number) {
        return process(number, (numb) -> {
            int new_number = 0;
            while (numb > 0) {
                int t = numb % 10;
                numb /= 10;
                if (t == 0)
                    continue;
                new_number = new_number * 10 + t;
            }
            return REVERSE(new_number);
        });
    }

    public int NE4ETTOLOW(int number) {
        return process(number, (numb) -> {
            int new_number = 0;
            while (numb > 0) {
                int t = numb % 10;
                numb /= 10;
                if (t % 2 == 1)
                    --t;
                new_number = new_number * 10 + t;
            }
            return REVERSE(new_number);
        });
    }

    public int process(int number, INumberProcess function) {
        return function.process(number);
    }
}