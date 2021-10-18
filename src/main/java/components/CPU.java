package components;

public class CPU extends ElectricalComponent {
  public CPU(String name, int energyUsage) {
    super(name);
    this.componentType = ComponentType.CPU;
    this.consumesEnergy = true;
    this.energyValue = energyUsage;
  }
}