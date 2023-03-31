package j27_Abstract.abstract04;

public abstract class Food {
    String name;

    public abstract void madeIn();

    public abstract void taste();

    @Override
    public String toString() {
        return
                "name='" + name ;
    }
}
