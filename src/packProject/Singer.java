package packProject;

import java.util.List;

public class Singer extends Produter {
    private int quantityOfSongs;
    private String duration;
    private List<String> namesOfSongs;

    public int getQuantityOfSongs() {
        return quantityOfSongs;
    }
    public String getDuration() {
        return duration;
    }
    public List<String> getNamesOfSongs() {
        return namesOfSongs;
    }

    public void setQuantityOfSongs(int quantityOfSongs) {
        this.quantityOfSongs = quantityOfSongs;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setNamesOfSongs(List<String> namesOfSongs) {
        this.namesOfSongs = namesOfSongs;
    }
}
