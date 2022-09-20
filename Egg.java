public class Egg extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Яйцо");
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException a) {
                throw new RuntimeException(a);
            }
        }
    }
}
