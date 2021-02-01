public class Task2 {
    public static void main(String[] args) {
        int number = 61119;
        String BinaryNumber = "";
        /*
            Ideya - mo}|{no vzat minimalnuyu 6-zna4nuyu stepen dvoiki
            N   |  654321
            -------------
            00	|  000001
            01	|  000002
            02	|  000004
            03	|  000008
            04	|  000016
            05	|  000032
            06	|  000064
            07	|  000128
            08	|  000256
            09	|  000512
            10  |  001024
            11  |  002048
            12  |  004096
            13  |  008192
            14  |  016384
            15  |  032768
            16  |  065536
            -------------
            17  |  131072

            Esli 4islo bolshe 65536 - pishem 1 i vyi4itaem 65536
            ina4e - 0

            tak}|{e uslovie - esli esce ne byilo simvola - mo}|{no propustit 0

            i tak concat-im do 4isla "0"

            0_0000_0000_0000_0000
        */
        
        // Proverit ko;-vo znakov
        int numberlength = CheckLengthNumber(number, 5);
        if (numberlength == 5) {
            // 16 razryad
            if (number >= 65536) {
                BinaryNumber += "1";
                number -= 65536;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            
            // razdelitel razryadov 16-15
            if (BinaryNumber.length() > 0) 
                BinaryNumber += "_";

            // 15 razryad
            if (number >= 32768) {
                BinaryNumber += "1";
                number -= 32768;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 14 razryad
            if (number >= 16384) {
                BinaryNumber += "1";
                number -= 16384;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 13 razryad
            if (number >= 8192) {
                BinaryNumber += "1";
                number -= 8192;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 12 razryad
            if (number >= 4096) {
                BinaryNumber += "1";
                number -= 4096;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // razdelitel razryadov 12-11
            if (BinaryNumber.length() > 0) 
                BinaryNumber += "_";

            // 11 razryad
            if (number >= 2048) {
                BinaryNumber += "1";
                number -= 2048;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 10 razryad
            if (number >= 1024) {
                BinaryNumber += "1";
                number -= 1024;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 9 razryad
            if (number >= 512) {
                BinaryNumber += "1";
                number -= 512;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 8 razryad
            if (number >= 256) {
                BinaryNumber += "1";
                number -= 256;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // razdelitel razryadov 8-7
            if (BinaryNumber.length() > 0) 
                BinaryNumber += "_";

            // 7 razryad
            if (number >= 128) {
                BinaryNumber += "1";
                number -= 128;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 6 razryad
            if (number >= 64) {
                BinaryNumber += "1";
                number -= 64;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 5 razryad
            if (number >= 32) {
                BinaryNumber += "1";
                number -= 32;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 4 razryad
            if (number >= 16) {
                BinaryNumber += "1";
                number -= 16;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // razdelitel razryadov 4-3
            if (BinaryNumber.length() > 0) 
                BinaryNumber += "_";

            // 3 razryad
            if (number >= 8) {
                BinaryNumber += "1";
                number -= 8;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 2 razryad
            if (number >= 4) {
                BinaryNumber += "1";
                number -= 4;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 1 razryad
            if (number >= 2) {
                BinaryNumber += "1";
                number -= 2;
            }
            else {
                if (BinaryNumber.length() > 0) 
                    BinaryNumber += "0";
            }
            // 0 razryad
            if (number >= 1) {
                BinaryNumber += "1";
            }
            else {
                BinaryNumber += "0";
            }
            System.out.print("Dvoi4naya forma ");
            System.out.println(BinaryNumber);
        }
        else {
            if (numberlength > 5) {
                System.out.println("Vvedite 5-zna4noe 4islo. Vvedeno (>5)-zna4noe");
            } else {
                System.out.print("Vvedite 5-zna4noe 4islo. Vvedeno ");
                System.out.print(numberlength);
                System.out.println("-zna4noe");
            }
        }
    }
    static int CheckLengthNumber(int number, int length) {
        // 1-yi razryad
        if (number < 10) {
            return 1;
        }
        number /= 10;
        // 2-oi razryad
        if (number < 10) {
            return 2;
        }
        number /= 10;
        // 3-ii razryad
        if (number < 10) {
            return 3;
        }
        number /= 10;
        // 4-yi razryad
        if (number < 10) {
            return 4;
        }
        number /= 10;
        // 5-yi razryad
        // 6-oi razryad
        if (number >= 10) {
            return 6;
        }
        else
            return 5;
    }
}
