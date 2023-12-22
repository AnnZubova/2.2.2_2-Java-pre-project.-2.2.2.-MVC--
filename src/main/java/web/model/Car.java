package web.model;

public class Car {
    private int id;
    private String model;
    private String series;

    public Car() {
    }

    public Car( int number, String model, String series) {
        this.id = number;
        this.model = model;
        this.series = series;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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
//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", series='" + series + '\'' +
//                ", id=" + id +
//                '}';
//    }
}
