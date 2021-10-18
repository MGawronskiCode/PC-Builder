package components;

public class RAM extends ElectricalComponent {
  public RAM(String name, int energyUsage) {
    super(name);
    this.componentType = ComponentType.RAM;
    this.consumesEnergy = true;
    this.energyValue = energyUsage;
  }
}
