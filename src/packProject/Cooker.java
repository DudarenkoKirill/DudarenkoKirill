package packProject;

import java.util.List;

public class Cooker extends Produter {
    private int quantityOfKindsOfBeer;
    private List<String> namesOfBeer;

    public int getQuantityOfKindsOfBeer() {
        return quantityOfKindsOfBeer;
    }
    public List<String> getNamesOfBeer() {
        return namesOfBeer;
    }

    public void setNamesOfBeer(List<String> namesOfBeer) {
        this.namesOfBeer = namesOfBeer;
    }
    public void setQuantityOfKindsOfBeer(int quantityOfKindsOfBeer) {
        this.quantityOfKindsOfBeer = quantityOfKindsOfBeer;
    }
}
