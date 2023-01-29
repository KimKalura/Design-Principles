package designprinciples.solid.dip.demo.computer.refactored;


public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

