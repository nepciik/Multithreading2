public class Main {
    public static void main(String[] args) {
        int fieldWidth = 29;
        int fieldHeight = 5;
        int beginningBridge = 6;
        int endBridge = 16;
        Field field = new Field();
        Car car0 = new Car(1, 22, 0, '<', beginningBridge, endBridge, fieldWidth);
        //Car car1 = new Car(1, 22, 0, '<');
        //Car car2 = new Car(1, 22, 0, '<');
        //Car car3 = new Car(1, 22, 0, '<');
        //Car car4 = new Car(1, 22, 0, '<');
        Car car5 = new Car(1, 25, 5, '<', beginningBridge, endBridge, fieldWidth);
        //Car car6 = new Car(1, 22, 0, '<');
        //Car car7 = new Car(1, 22, 0, '<');
        Car car8 = new Car(1, 28, 8, '<', beginningBridge, endBridge, fieldWidth);
        Car car9 = new Car(1, 19, 9, '<', beginningBridge, endBridge, fieldWidth);

        Car[] cars = new Car[4];
        cars[0] = car0;
        cars[1] = car5;
        cars[2] = car8;
        cars[3] = car9;
        while (true)
            field.drawField(cars, beginningBridge, endBridge);
    }
}
