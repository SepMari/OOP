public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;


    public Flower(String name, String flowerColor, String country, float cost, int lifeSpan) {
        if (name == null || name.isEmpty() || name.isBlank()){
            this.name = "Цветок";
        } else this.name = name;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()){
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;

        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        } else this.country = country;

        if (cost <= 0) {
            this.cost = 1;
        } else this.cost = cost;

        if (lifeSpan < 0) {
            this.lifeSpan = 3;
        } else this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()){
            this.flowerColor = "белый";
        } else this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        } else this.country = country;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            this.country = "Цветок";
        } else this.country = name;
    }

    @Override
    public String toString() {
        return "Flower: " + '\'' + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}


/*
    Стоимость букета рассчитывается в зависимости от состава + 10% надбавка за работу флориста.
    Срок стояния букета считается по наименьшему сроку.
    В консоль должна выводиться информация о составе букета, его стоимости и сроке стояния.
    Например, букет, в котором есть роза обыкновенная – 3 , хризантема – 5, гипсофила – 1, будет стоить 220,84 рублей
    и простоит 3 суток.
 */