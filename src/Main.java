public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(-1987, " ", " ", " ");
        Human ania = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        Human katia = new Human(1994, "Катя", "Калининград", "продакт-менеджером");
        Human artem = new Human(1995, "Артем", "Москва", "директором по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", " ");

        System.out.println(maxim);
        System.out.println(ania);
        System.out.println(katia);
        System.out.println(artem);
        System.out.println(vladimir);


        Flower rose = new Flower("Роза обыкновенная"," ", "Голландия", 35.59f, 0);
        Flower chrysanthemum = new Flower("Хризантема", " ", " ", 15.0f, 5);
        Flower peony = new Flower("Пион"," ","Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", " ", "Турция", 19.5f, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        printPriceBouquet(rose,rose,rose,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,gypsophila);
    }

    private static void printPriceBouquet(Flower... flowers){
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;

        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan){
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            System.out.println(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: %.2f", totalCost);
        System.out.println();
        System.out.println("Срок букета: " + minLifeSpan);
    }
}

/*
    1е задание
    Создан класс human со свойствами yearOfBirth, name, town и job
    Создан объект Максим со свойствами класса human
    Создан объекта Аня со свойствами класса human
    Создан объект Катя со свойствами класса human
    Создан объект Артем со свойствами класса human
    В консоль выводится сообщение: "Привет! Меня зовут …. Я из города …. Мне … лет. Я работаю на должности… . Будем знакомы!" для каждого объекта
    Переменные инициализированы согласно правилам camelCase

    2е задание
    Роза обыкновенная из Голландии, стоимость штуки – 35,59 рублей
    Хризантема, стоимость штуки – 15 рублей, срок стояния – 5 дней
    Пион из Англии, стоимость штуки – 69,9 рублей, срок стояния – 1 день
    Гипсофила, страна происхождения – Турция, стоимость штуки – 19,5 рублей, срок стояния – 10 дней

    Стоимость букета рассчитывается в зависимости от состава + 10% надбавка за работу флориста.
    В консоль должна выводиться информация о составе букета, его стоимости и сроке стояния.
    Например, букет, в котором есть роза обыкновенная – 3 , хризантема – 5, гипсофила – 1, будет стоить 223,63
 */