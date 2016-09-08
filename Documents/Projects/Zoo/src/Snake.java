/**
 * Created by nathanielellsworth on 9/8/16.
 */
public class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
    }

    @Override
    public void makeSound() {
        System.out.println("Sssssssss!");
    }
}
