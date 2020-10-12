public class Printer {
    private char firstBlood = 'A';

    public synchronized void printA() {
        try {
            for (int i = 0; i < 5; i++) {

                while (firstBlood != 'A') {
                    wait();
                }
                System.out.print(firstBlood);
                firstBlood = 'B';

                notifyAll();

            }
        } catch (Exception e) {
            throw new RuntimeException("SWW");
        }
            }
    public synchronized void printB() {
        try {
            for (int i = 0; i < 5; i++) {

                while (firstBlood != 'B') {
                    wait();
                }
                System.out.print(firstBlood);
                firstBlood = 'C';

                notifyAll();

            }
        } catch (Exception e) {
            throw new RuntimeException("SWW");
        }
    }

    public synchronized void printC() {
        try {
            for (int i = 0; i < 5; i++) {

                while (firstBlood != 'C') {
                    wait();
                }
                System.out.print(firstBlood);
                firstBlood = 'A';

                notifyAll();

            }
        } catch (Exception e) {
            throw new RuntimeException("SWW");
        }
    }

}
