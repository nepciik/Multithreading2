public class Car extends Thread {
    char course;
    int y, x, number, beginningBridge, endBridge, fieldWidth;

    Car(int y, int x, int number, char course, int beginningBridge, int endBridge, int fieldWidth) {
        this.number = number;
        this.y = y;
        this.x = x;
        this.course = course;
        this.endBridge = endBridge;
        this.beginningBridge = beginningBridge;
        this.fieldWidth = fieldWidth;
    }

    public void go() {
        if (course == '<')
            x--;
        else
            x++;
        if (x - 1 == endBridge)
            y++;
        if (x + 1 == beginningBridge)
            y--;
        if (x < 0) {
            course = '>';
            y = 3;
        }
        if (x > fieldWidth) {
            course = '<';
            y = 1;
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*private int count = 0;
    public synchronized void onBridge() throws Exception {
        while (count == 3) {
            wait();
        }
    }*/
}
