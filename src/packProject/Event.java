package packProject;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public abstract class Event {
    private InformationAboutEvent information;

    public void setInformation(String name,Date date,Time time,String nameOfThePlace,int capacity, boolean bar,int quantityOfParticipants, List<Produter> produterList) {
        information.setName(name);
        information.setDate(date);
        information.setTime(time);
        Place place=new Place();
        place.setNameOfThePlace(nameOfThePlace);
        place.setCapacity(capacity);
        place.setBar(bar);
        information.setPlace(place);
        information.setQuantityOfParticipants(quantityOfParticipants);
        information.setProduterList(produterList);
    }

    public InformationAboutEvent getInformation() {
        return information;
    }
}
