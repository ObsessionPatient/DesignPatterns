package activeobject;

public interface ActiveObject {
    public abstract Result solveEvent(String message);
    public abstract void kill();
}
