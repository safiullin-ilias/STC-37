package HW_6;

public class _Task {
    public static void main(String[] args) {
        TV tv = new TV();

        Channel profilaktika = new Channel("Профилактический");
        profilaktika.addProgram("Настроечная таблица");
        profilaktika.addProgram("Расписание телепередач");
        tv.addChannel(profilaktika);

        Channel ORT = new Channel("ОРТ");
        ORT.addProgram("Что-то про политику");
        ORT.addProgram("Что-то про корону");
        ORT.addProgram("Сериальчик");
        ORT.addProgram("Малахов");
        tv.addChannel(ORT);

        Channel RTR = new Channel("РТР");
        RTR.addProgram("Утро России");
        RTR.addProgram("Вести");
        RTR.addProgram("Соловьёв");
        tv.addChannel(RTR);

        Channel TVIN = new Channel("ТВ-ИН");
        TVIN.addProgram("Времечко");
        TVIN.addProgram("Зеленый остров");
        TVIN.addProgram("Играет Металлург");
        tv.addChannel(TVIN);

        Channel OTV = new Channel("ОТВ");
        OTV.addProgram("Новости области");
        OTV.addProgram("Играет Трактор");
        OTV.addProgram("Сериальчик");
        tv.addChannel(OTV);
        
        RemoteController pult = new RemoteController(tv);
        Program p = pult.selectChannel(0);
        if (p != null)
            System.out.println("Сейчас идет " + p.getName());
        System.out.println();
        p = pult.selectChannel(2);
        if (p != null)
            System.out.println("Сейчас идет " + p.getName());
        System.out.println();
        p = pult.selectChannel(3);
        if (p != null)
            System.out.println("Сейчас идет " + p.getName());
        System.out.println();
        p = pult.selectChannel(5);
        if (p != null)
            System.out.println("Сейчас идет " + p.getName());
    }    
}
