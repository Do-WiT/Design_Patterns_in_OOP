public class PropertyChangedEvent<T> {
    public T source;
    public String propertyName;
    public Object newValue;

    public PropertyChangedEvent(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}
