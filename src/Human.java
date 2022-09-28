public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (name == null || name.isEmpty() || name.isBlank()){
            this.name = "Информация не указана";
        } else this.name = name;

        if (job == null || job.isEmpty() || job.isBlank()){
            this.job = "Информация не указана";
        } else this.job = job;

        if (town == null || town.isEmpty() || town.isBlank()){
            this.town = "Информация не указана";
        } else this.town = town;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job +
                ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >=0 || yearOfBirth != 0) {
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = 0;

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()){
            this.town = "Информация не указана";
        } else this.town = town;
    }
}

/*
    3е задание
    Дополните созданные ранее конструкторы проверками, которые позволяют проверить, что год рождения не может быть отрицательным
    или ставит значение по умолчанию, равное нулю.
    Если не указано имя, город проживания или должность, то программа должна подставить значение "Информация не указана"
    при выводе в консоль.
 */