package work;

public class GBOXT<T> {
    T container;

    public GBOXT(T container){
        this.container=container;
    }

    public T getContainer() {
        return container;
    }
}
