public class Main {

    public static void makeTea() {
        // невозвращаемый метод без параметров
        System.out.println("Вскипятить воду");
        System.out.println("Положить чай");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по-вкусу");
        // public static void test() {}
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        addition(5, 15, "Java programming");
        addition(100, 40, "I love JAVA");
        calculatePerimeter("Аудитория 2", 3.5, 4.5);
        calculatePerimeter("Кухня", 2.5, 3);
        calculatePerimeter("Холл", 5, 7.5);
        double areaOfAuditory2 = calculateArea(3.5, 4.5);
        System.out.println("Площадь аудитории 2: " + areaOfAuditory2 + " кв. "
                + unit() + ".");
        double areaOfKitchen = calculateArea(2.5, 3);
        System.out.println("Площадь кухни: " + areaOfKitchen + " кв. "
                + unit() + ".");
        double areaOfHall = calculateArea(5, 7.5);
        System.out.println("Площадь холла: " + areaOfHall + " кв. "
                + unit() + ".");
        System.out.println("ИТОГО: " +
                (areaOfAuditory2 + areaOfKitchen + areaOfHall) + " кв. "
                + unit() + ".");
    }

    public static String unit() {
        // возвращаемый метод без параметров
        return "см";
    }

    public static double calculateArea(double length, double width) {
        // возвращаемый метод с параметрами
        return length * width;
    }

    public static void calculatePerimeter(String roomName, double length, double width) {
        // невозвращаемый метод с параметрами
        System.out.println("Периметр комнаты " + roomName + ": "
                + 2 * (length + width) + " " + unit() + ".");
        ;
    }

    public static void addition(int number_1, int number_2, String phrase) {
        // невозвращаемый метод с параметрами
        System.out.println("Сумма чисел: " + (number_1 + number_2));
        System.out.println("Фраза: " + phrase);
    }
}