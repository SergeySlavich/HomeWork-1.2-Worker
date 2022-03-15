public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    void onDone(String result) {

    }
    void onError(String errorMsg){

    }

    public void start() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if(i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                callback.onDone("Task " + i + " is not done. ERROR!");
            }
        }
    }

}
