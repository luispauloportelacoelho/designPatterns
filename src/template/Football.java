package template;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football game started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football game finished.");
    }
}
