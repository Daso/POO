package guerrainterestelar;

public class ZergFactory {

    public Zerg creadoraZerg(String tipoZerg) {
        if (tipoZerg.equals("Z")) {
            return new Zerling();
        } else if (tipoZerg.equals("U")) {
            return new Ultralisk();
        } else if (tipoZerg.equals("M")) {
            return new ZerglingMutado();
        } else {
            return null;
        }

    }
}
