package HW_14;
import java.util.List;

import java.io.BufferedReader;
import java.util.Comparator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AutomobileRepositoryFile implements IAutomobileRepository {
    private String fileName;

    public AutomobileRepositoryFile(String fileName) {
        this.fileName = fileName;
    }

    private static final Function<String, Automobile> autoParser = line -> {
        String parsedLine[] = line.split("\\]");
        return new Automobile(parsedLine[0].split("\\[")[1],
                parsedLine[1].split("\\[")[1],
                parsedLine[2].split("\\[")[1],
                Integer.parseInt(parsedLine[3].split("\\[")[1]),
                Integer.parseInt(parsedLine[4].split("\\[")[1])
            );
    };


    public List<Automobile> findAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> autos = reader
                    .lines()
                    .map(autoParser)
                    .collect(Collectors.toList());
            reader.close();
            return autos;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }
    public List<Automobile> findByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> autos = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getColor().toLowerCase().equals(color.toLowerCase()))
                    .collect(Collectors.toList());
            reader.close();
            return autos;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Automobile> findByProbeg(int min, int max) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> autos = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getProbeg() >= min && auto.getProbeg() <= max)
                    .collect(Collectors.toList());
            reader.close();
            return autos;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Automobile> findByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> autos = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getModel().toLowerCase().equals(model.toLowerCase()))
                    .collect(Collectors.toList());
            reader.close();
            return autos;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Automobile> findByPriceDiapazon(int min, int max) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> autos = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getPrice() >= min && auto.getPrice() <= max)
                    .collect(Collectors.toList());
            reader.close();
            return autos;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<String> NumbersOfBlackOrNew() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> numbers = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getColor().toLowerCase().equals("черный") || auto.getProbeg() == 0)
                    .map(Automobile::getNumber)
                    .collect(Collectors.toList());
            reader.close();
            return numbers;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    public Integer UniqueModelsByPrice() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> models = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getPrice() >= 700000 && auto.getPrice() <= 800000)
                    .map(Automobile::getModel)
                    .collect(Collectors.toList());
            reader.close();
            int Count = 0;
            for (int i = 0; i < models.size(); i++) {
                if (models.lastIndexOf(models.get(i)) == i)
                    Count ++;
            }
            return Count;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    public String ColorOfMinPrice() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Automobile> models = reader
                    .lines()
                    .map(autoParser)
                    .sorted(Comparator.comparing(Automobile::getPrice))
                    .collect(Collectors.toList());
            reader.close();
            return models.get(0).getColor();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    public Integer AverageCamry() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Integer> models = reader
                    .lines()
                    .map(autoParser)
                    .filter(auto -> auto.getModel().toLowerCase().equals("camry"))
                    .map(Automobile::getPrice)
                    .collect(Collectors.toList());
            reader.close();
            int Summ = 0;
            for (int i = 0; i < models.size(); i++) {
                Summ += models.get(i);
            }
            return Summ / models.size();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
