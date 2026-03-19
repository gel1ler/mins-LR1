import model.ChemicalProduct;
import model.ElectronicsProduct;
import model.FoodProduct;
import repository.CellRepository;
import repository.InMemoryCellRepository;
import service.DefaultNeighborhoodValidator;
import service.NeighborhoodValidator;
import service.WarehouseService;
import ui.ConsoleUI;

//Подлкючить гит, в новой ветке сделать задание

public class Main {
    public static void main(String[] args) {
        CellRepository repository = new InMemoryCellRepository();
        loadSeedData(repository);
        NeighborhoodValidator validator = new DefaultNeighborhoodValidator();
        WarehouseService warehouseService = new WarehouseService(repository, validator);
        ConsoleUI ui = new ConsoleUI(warehouseService);

        System.out.println("Добро пожаловать в склад");
        ui.run();
    }

    // Вынести в репозиторий
    private static void loadSeedData(CellRepository repository) {
        repository.save(1, new FoodProduct("f1", "Молоко", 50));
        repository.save(2, new FoodProduct("f2", "Хлеб", 100));
        repository.save(10, new ElectronicsProduct("e1", "Телефон", 25));
        repository.save(20, new ChemicalProduct("c1", "Стиральный порошок", 30));
    }
}
