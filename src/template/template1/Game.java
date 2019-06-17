package template.template1;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template.template method
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
