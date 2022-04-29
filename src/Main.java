public class Main {

    public static void main(String[] args) {
        double weight;               // Вес в кг
        double height;               // Рост в м

        BmiService service = new BmiService();
        double bmi = service.calculate(1.5, 81.5);
        System.out.println("Ваш индекс массы тела (BMI): " + bmi);
    }
}
