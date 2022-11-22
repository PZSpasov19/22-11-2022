import java.util.Scanner
public class Main {
    public static void main(String[] args)
    {
        /*Animal animal = new Animal(10, "Bear");
        animal.eat();

        Cat cat = new Cat(20, "Kaspiiska", "Granuli");
        cat.eat();*/
        /*1.Напишете метод на джава да проверим дали даден низ е валидна парола
        * 2. Създайте програма за персонализиране проверени и непроверени изключения.

        Person person = new Person("Pesho", 20);
        System.out.println(person.getname());
        person.setName("12345");
        System.out.println(person.getname());
         */
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);
        System.out.printf("Surface Area - %.2f", box.calculateSurfaceArea());
        System.out.println(box.calculateLateralSurfaceArea());
        System.out.println(box.calculateVolume());
    }


}
