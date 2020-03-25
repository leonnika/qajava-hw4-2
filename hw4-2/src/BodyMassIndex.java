public class BodyMassIndex {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // укажите вес в кг, рост в см
        float bmi = service.calculate(50,165);
        System.out.println("Индекс Массы Тела : "+ bmi);
    }
}
