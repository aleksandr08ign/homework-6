public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println(fullName);
    }

    public static void task2() {
        System.out.println("Задача 2.");
        String fullName2 = "Ivanov Ivan Ivanovich";
        System.out.println(fullName2.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3.");
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);
    }
}