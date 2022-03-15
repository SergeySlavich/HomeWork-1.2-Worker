public class Main {
    public static void main(String[] args){

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener);
        Worker error = new Worker(errorListener);
        worker.start();

    }
}
