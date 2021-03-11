package HW_7;

public class Task1 {
    public static void main(String[] args) {
        User Ilias = User.builder()
                        .firstName("Ilias")
                        .lastName("Safiullin")
                        .age(26)
                        .isWorker(true)
                        .build();
        System.out.println(Ilias);


        User Vasya = User.builder()
                        .firstName("Vasya")
                        .lastName("Pupkin")
                        .age(20)
                        .isWorker(false)
                        .build();
        System.out.println(Vasya);
    }
}
