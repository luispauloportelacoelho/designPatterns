package template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished.");
    }
}
