package HW_10;

public class Main {
    public static void main(String[] args) {
        IList<Integer> integerList = new LinkedList<>();
        integerList.push(5);
        integerList.push(12);
        integerList.push(22);
    //        integerList.push("Hello");

        int n1 = integerList.get(0);
        int n2 = integerList.get(1);
        int n3 = integerList.get(2);
    //        String value = integerList.get(0);


        IIterator<Integer> integerIterator = integerList.iterator();

        while (integerIterator.hasNext()) {
            int currentNumber = integerIterator.next();
            System.out.println(currentNumber);
        }

        integerList.remove(55);
        integerList.removeByIndex(0);

        integerList.insert(3, 9);
        
        integerList.addToBegin(5555);

        integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            int currentNumber = integerIterator.next();
            System.out.println(currentNumber);
        }
        System.out.println(integerList.contains(55));

        System.out.println("Stroki");


        IList<String> stringsList = new ArrayList<>();
        stringsList.push("Odin");
        stringsList.push("Dva");
        stringsList.push("Tri");
    //        stringsList.push(1);

        String value1 = stringsList.get(0);
        String value2 = stringsList.get(1);
        String value3 = stringsList.get(2);
    //        int value = stringsList.get(0);

        IIterator<String> innoIterator = stringsList.iterator();

        while (innoIterator.hasNext()) {
            String currentString = innoIterator.next();
            System.out.println(currentString);
        }

        
        stringsList.remove("4etire");
        stringsList.removeByIndex(0);


        stringsList.insert(1, "Pyat'");
        
        stringsList.addToBegin("LLiest'");
        innoIterator = stringsList.iterator();
        while (innoIterator.hasNext()) {
            String currentString = innoIterator.next();
            System.out.println(currentString);
        }
    }
}
