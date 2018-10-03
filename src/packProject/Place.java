package packProject;

public class Place {
    private String nameOfThePlace;
    private int capacity;
    private boolean bar;

    public String getNameOfThePlace() {
        return nameOfThePlace;
    }
    public int getCapacity() {
        return capacity;
    }
    public boolean isBar() {
        return bar;
    }

    public void setNameOfThePlace(String nameOfThePlace) {
        this.nameOfThePlace = nameOfThePlace;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setBar(boolean bar) {
        this.bar = bar;
    }
}
