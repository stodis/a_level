package custom;

public class worker {
    String name;
    boolean isAtWork;
    boolean isSober;

    void atWork(){
        isAtWork = true;
    }
    void sober(){
        isSober = true;
    }

    void work()throws WorkerIsNotReady{
        if(isAtWork && isSober){
            System.out.println("Go working");
        }else {
          throw new WorkerIsNotReady("Go home");
        }
    }

    public worker(String name) {
        this.name = name;
    }

}
