public class Main {
    public static void main(String[] args) {
        System.out.println(personAge(22, 33));
        System.out.println(personAge(54, 5));
        System.out.println(personAge(25, 13));
        System.out.println(personAge(6, 28));
        System.out.println(personAge(12, 7));
//        System.out.println(generateRandom());
        System.out.println(generateRandom());
    }

    public static String personAge(int age, int temp) {
        String ageAndTemper1 = "Можно идти гулять";
        String ageAndTemper2 = "Оставайся дома";
        if (age >= 20 && age <= 45 && temp >= -20 && age <= 30) {
            return ageAndTemper1;
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return ageAndTemper1;
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return ageAndTemper1;
        } else
            return ageAndTemper2;
    }

    public static int generateRandom() {
        int ageRandom = 0 + (int) (Math.random() * 50);
        return ageRandom;
    }
}
/*
Дэдлайн 03.01.2022 23 59
Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице,
и возвращать результат в виде строки.
Алгоритм метода должен работать следующим образом:
если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат -
“Можно идти гулять”;
если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -
“Можно идти гулять”;
а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в
диапазоне от -10 до 25 градусов;
В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в
консоль.
ДЗ на сообразительность:
Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с
помощью метода “generateRandomAge” test(23, 10); test(generateRandomAge(), 10);*/
