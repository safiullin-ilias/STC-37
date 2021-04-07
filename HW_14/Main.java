package HW_14;

public class Main {
    public static void main(String[] args) {
        IAutomobileRepository autoRepository = new AutomobileRepositoryFile("HW_14/autos.txt");
        System.out.println("Nomera 4ernyih i novyih");
        System.out.println(autoRepository.NumbersOfBlackOrNew());
        System.out.println("Uniqalnyie v diapazone");
        System.out.println(autoRepository.UniqueModelsByPrice());
        System.out.println("Samaya deshevaya imeet tsvet");
        System.out.println(autoRepository.ColorOfMinPrice());
        System.out.println("Srednyaya tsena camry");
        System.out.println(autoRepository.AverageCamry());

    }
}
