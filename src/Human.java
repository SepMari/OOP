public class Human {

    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(int yearOfBirth, String town, String job) {
        this(yearOfBirth, "Информация не указана", town, job);
    }

    public Human(int yearOfBirth, String job) {
        this(yearOfBirth, "Информация не указана", job);
    }

    public Human(int yearOfBirth) {
        this(yearOfBirth, "Информация не указана");
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        this.name = name;
        this.town = town;
        this.job = job;

        if (yearOfBirth >=0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job +
                ". Будем знакомы!";
    }
}

/*
    3е задание
    Дополните созданные ранее конструкторы проверками, которые позволяют проверить, что год рождения не может быть отрицательным
    или ставит значение по умолчанию, равное нулю.
    Если не указано имя, город проживания или должность, то программа должна подставить значение "Информация не указана"
    при выводе в консоль.
 */