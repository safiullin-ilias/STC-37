package HW_14;
import java.util.List;


public interface IAutomobileRepository {
    List<Automobile> findAll();
    List<Automobile> findByColor(String color);
    List<Automobile> findByProbeg(int min, int max);
    List<Automobile> findByModel(String model);
    List<Automobile> findByPriceDiapazon(int min, int max);
    List<String> NumbersOfBlackOrNew();
    Integer UniqueModelsByPrice();
    String ColorOfMinPrice();
    Integer AverageCamry();
}
