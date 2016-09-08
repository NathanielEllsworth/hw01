/**
 * Created by nathanielellsworth on 9/8/16.
 */
public class Animal {
    public String name;

    public void makeSound() {
        System.out.println("Animal sound!");
    }

    @Override
    public String toString() {
        return this.name;
    }
}