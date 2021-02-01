class Task1 {
    public static void main(String[] args) {
        int number = 74861;
        int digitsSum = 0;
        
        /*
            Ideya - proiti 5 raz otce4eniem poslednei tsifryi
            Esli oka}|{etsa, 4to tsifryi net - to oLLIibka
            Esli posle 5-oi tsifryi esce ostaetsa tsifra - oLLIbka
        */

        // 1-yi razryad
        if (number < 10) {
            System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno 1-zna4noe");
            return;
        }
        else
            digitsSum += number % 10;
        number /= 10;
        // 2-oi razryad
        if (number < 10) {
            System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno 2-zna4noe");
            return;
        }
        else
            digitsSum += number % 10;
        number /= 10;
        // 3-ii razryad
        if (number < 10) {
            System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno 3-zna4noe");
            return;
        }
        else
            digitsSum += number % 10;
        number /= 10;
        // 4-yi razryad
        if (number < 10) {
            System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno 4-zna4noe");
            return;
        }
        else
            digitsSum += number % 10;
        number /= 10;
        // 5-yi razryad
        digitsSum += number % 10;
        number /= 10;
        // 6-oi razryad
        if (number > 0) {
            System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno (>5)-zna4noe");
            return;
        }
        System.out.print("Summa tsifr = ");
        System.out.println(digitsSum);
    }
}