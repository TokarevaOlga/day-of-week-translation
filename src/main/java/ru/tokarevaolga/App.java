package ru.tokarevaolga;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> daysOfWeek = new HashMap<>();
        daysOfWeek.put("monday", "понедельник");
        daysOfWeek.put("tuesday", "вторник");
        daysOfWeek.put("wednesday", "среда");
        daysOfWeek.put("thursday", "четверг");
        daysOfWeek.put("friday", "пятница");
        daysOfWeek.put("saturday", "суббота");
        daysOfWeek.put("sunday", "воскресенье");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название дня недели на английском языке: ");
        String englishDay = sc.nextLine();

        String rusDay = daysOfWeek.get(englishDay);

        if (rusDay != null) {
            System.out.println("День недели на русском: " + rusDay);
        } else {
            System.out.println("День недели не найден. Проверьте правильность ввода. " +
                    "Название дня недели должно быть указано на английском языке и с маленькой буквы.");
        }
    }
}
