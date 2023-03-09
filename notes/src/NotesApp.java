import java.util.ArrayList;
import java.util.Scanner;

public class NotesApp {
    private static ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить заметку");
            System.out.println("2. Показать заметки");
            System.out.println("3. Удалить заметку");
            System.out.println("4. Выход");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    addNote();
                    break;
                case "2":
                    showNotes();
                    break;
                case "3":
                    deleteNote();
                    break;
                case "4":
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        } while (!input.equals("4"));
    }

    private static void addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заметку:");
        String note = scanner.nextLine();
        notes.add(note);
        System.out.println("Заметка добавлена");
    }

    private static void showNotes() {
        if (notes.isEmpty()) {
            System.out.println("Нет заметок");
        } else {
            System.out.println("Заметки:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i + 1) + ". " + notes.get(i));
            }
        }
    }

    private static void deleteNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер заметки, которую нужно удалить:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки
        if (index < 1 || index > notes.size()) {
            System.out.println("Некорректный номер заметки");
        } else {
            notes.remove(index - 1);
            System.out.println("Заметка удалена");
        }
    }
}