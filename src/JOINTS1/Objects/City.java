package JOINTS1.Objects;

public class City {
    Long id;
    String name;
    String code;

    public City(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public City() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
