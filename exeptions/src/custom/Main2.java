package custom;

public class Main2 {
    public static void main(String[]arg){
       worker worker = new worker("den");
      worker worker2 = new worker("Izya");
      worker2.atWork();
      worker2.sober();
        try {
            worker2.work();
        } catch (WorkerIsNotReady workerIsNotReady) {
            workerIsNotReady.printStackTrace();
        }




    }

}
