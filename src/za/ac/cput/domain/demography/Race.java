package za.ac.cput.domain.demography;

public class Race {

    private String id;
    private String description;

    private Race() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //Builder here
}
