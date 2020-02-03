package task6;

public class Main {

    public static void main(String[] args) {
        NuclearSubmarin nuclearSubmarin = new NuclearSubmarin();

        NuclearSubmarin.SubmarinEngine submarinEngine = nuclearSubmarin.new SubmarinEngine();
        submarinEngine.startEngine();
        nuclearSubmarin.fullSpeedAhead();
        submarinEngine.stopEngine();
    }
}
