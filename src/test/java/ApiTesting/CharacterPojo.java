package ApiTesting;

import java.util.List;

// This is a Pojo class that we are going to use to set and get the information retrieve by the API
public class CharacterPojo {

    private List<String> name;
    private List<String> portrayed;
    private List<String> birthday;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getPortrayed() {
        return portrayed;
    }

    public void setPortrayed(List<String> portrayed) {
        this.portrayed = portrayed;
    }

    public List<String> getBirthday() {
        return birthday;
    }

    public void setBirthday(List<String> birthday) {
        this.birthday = birthday;
    }

}
