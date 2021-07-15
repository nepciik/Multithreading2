public class Field {
    int fieldWidth = 29;
    int fieldHeight = 5;

    public void drawField(Car[] car, int beginningBridge, int endBridge) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                if (i == 0 || i == fieldHeight - 1)
                    System.out.print("-");
                else if (i == 1 && j == beginningBridge)
                    System.out.print("|");
                else if (i == 1 && j == endBridge)
                    System.out.print("|");
                else if (i == fieldHeight - 2 && j == beginningBridge)
                    System.out.print("|");
                else if (i == fieldHeight - 2 && j == endBridge)
                    System.out.print("|");
                else if ((i == 1 || i == fieldHeight - 2) && (j > beginningBridge && j < endBridge))
                    System.out.print("-");
                else if (i == car[0].y && j == car[0].x)
                    System.out.print(car[0].number);
                else if (i == car[0].y && j == car[0].x - 1)
                    System.out.print(car[0].course);
                else if (i == car[1].y && j == car[1].x)
                    System.out.print(car[1].number);
                else if (i == car[1].y && j == car[1].x - 1)
                    System.out.print(car[1].course);
                else if (i == car[2].y && j == car[2].x)
                    System.out.print(car[2].number);
                else if (i == car[2].y && j == car[2].x - 1)
                    System.out.print(car[2].course);
                else if (i == car[3].y && j == car[3].x)
                    System.out.print(car[3].number);
                else if (i == car[3].y && j == car[3].x - 1)
                    System.out.print(car[3].course);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        car[0].go();
        car[1].go();
        car[2].go();
        car[3].go();
    }
}
