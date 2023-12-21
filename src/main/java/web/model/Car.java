package web.model;

public class Car {
    private int id;
    private String model;
    private String series;

    public Car() {
    }

    public Car(int number, String model, String series) { //id
        this.model = model;
        this.series = series;
        this.id = number;
    }

    public String getName() {
        return model;
    }

    public void setName(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }
}
