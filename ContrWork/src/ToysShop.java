public class ToysShop {
    private String name;
    private int id;
    private int percent;

    public ToysShop(String name, int id, int percent) {
        this.name = name;
        this.id = id;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
