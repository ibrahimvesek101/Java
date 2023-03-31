package j27_Abstract.abstract04;

public abstract class Sweet extends Food {  //parent abstract ancak Grandparent Food a child.


    @Override
    public void taste() {
        System.out.println("good, sugar, sweet");
    }
}
