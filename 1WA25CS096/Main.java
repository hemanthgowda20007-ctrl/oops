WindEnergy(int sourceID, String sourceName, double energyGenerated) {
super(sourceID, sourceName, energyGenerated);
}


void calculateEfficiency() {
double efficiency = (energyGenerated / 8000) * 100;
System.out.println("Efficiency: " + efficiency + "%");
}
}


public class Main {
public static void main(String[] args) {


EnergySource e;


e = new SolarEnergy(981, "dfgh", 5000);

System.out.println("----- Solar Energy -----");
e.displayDetails();
e.calculateEfficiency();


e = new WindEnergy(871, "rcty", 4500);

System.out.println("\n----- Wind Energy -----");
e.displayDetails();
e.calculateEfficiency();
}
}
