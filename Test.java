import java.lang.ref.Cleaner;

class Test {

    private static final Cleaner cleaner = Cleaner.create();

    private static class CleanUpTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Object is garbage collected (Cleaner used)");
        }
    }

    Test() {
        cleaner.register(this, new CleanUpTask());
    }

    public static void main(String[] args) {
        System.gc();
    }
}
