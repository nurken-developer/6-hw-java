package subtask2;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

    public abstract Transport createTransport();
}
