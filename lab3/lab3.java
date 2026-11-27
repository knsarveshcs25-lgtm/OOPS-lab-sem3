package lab3;
abstract class EnergySource {
    protected String sourceId;
    protected String sourceName;
    protected double energyGenerated;
    public EnergySource(String sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }
    public abstract double calculateEfficiency();

    public void displayDetails() {
        System.out.println("Source ID        : " + sourceId);
        System.out.println("Source Name      : " + sourceName);
        System.out.printf("Energy Generated : %.2f kWh%n", energyGenerated);
        System.out.printf("Efficiency       : %.2f%%%n", calculateEfficiency());
        System.out.println("---------------------------------------");
    }
}
class SolarEnergy extends EnergySource {
    private static final double MAX_SOLAR_CAPACITY = 5000.0;

    public SolarEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }
    @Override
    public double calculateEfficiency() {
        return (energyGenerated / MAX_SOLAR_CAPACITY) * 100.0;
    }
}
class WindEnergy extends EnergySource {
    private static final double MAX_WIND_CAPACITY = 8000.0;

    public WindEnergy(String sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }
    @Override
    public double calculateEfficiency() {
        return (energyGenerated / MAX_WIND_CAPACITY) * 100.0;
    }
}
public class lab3 {
     public static void main(String[] args) {
        EnergySource source;

        System.out.println("=== Energy Source Efficiency Report ===\n");

        source = new SolarEnergy("SOL-201", "Rooftop Solar Array", 3750.0);
        source.displayDetails();

        source = new WindEnergy("WND-301", "Coastal Wind Turbine", 6200.0);
        source.displayDetails();
        System.out.println("\nKN Sarvesh Kumar\n1WN25CS104");
    }
}
