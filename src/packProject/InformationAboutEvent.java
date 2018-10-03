package packProject;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InformationAboutEvent{

    private String name;
    private Date date;
    private Time time;
    private Place place;
    private int quantityOfParticipants;
    private List<Produter> produterList;

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public void setPlace(Place place) {
        this.place = place;
    }
    public void setQuantityOfParticipants(int quantityOfParticipants) {
        this.quantityOfParticipants = quantityOfParticipants;
    }
    public void setProduterList(List<Produter> produterList) {
        this.produterList = produterList;
    }

    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public Time getTime() {
        return time;
    }
    public Place getPlace() {
        return place;
    }
    public int getQuantityOfParticipants() {
        return quantityOfParticipants;
    }
    public List<Produter> getProduterList(String nameOfEvent) {
        return refeelList(nameOfEvent);
    }



    private List<Produter> refeelList(String nameOfEvent){return new ArrayList<Produter>();};
}
