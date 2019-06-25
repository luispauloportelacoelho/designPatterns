package compound;

import java.util.Observer;

public interface Quackable extends QuackObservable {
    void quack();
}
