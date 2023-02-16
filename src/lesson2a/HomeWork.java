package lesson2a;

public class HomeWork {
    public static void main(String[] args) {
        Author dovlatov = new Author("Сергей", "Довлатов");
        Author bulgakov = new Author("Михаил", "Булгаков");

        System.out.println(dovlatov);

        Book remeslo = new Book("Ремесло", 1975, dovlatov);
        Book morfiy = new Book("Морфий", 1926, bulgakov);

        System.out.println(dovlatov.equals(remeslo));

        System.out.println(remeslo.toString());
        System.out.println(morfiy.toString());

        remeslo.setPublishingYear(1976);
        System.out.println(remeslo.toString());

    }
}
