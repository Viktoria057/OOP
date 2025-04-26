package Lab10.Task2;

public class Main {
    public static void main(String[] args) {
        Playable[] instruments = { new Guitar(), new Piano() };

        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
