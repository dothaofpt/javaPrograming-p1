package Generic.Entity;

public class Entity<T> {
    //T đại diện cho tâp hợp kiểu dữ liệu
    private T id;

    public Entity() {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
