package components;

public class PowerSupply extends ElectricalComponent {
  public PowerSupply(String name, int energySupplyValue) {
    super(name);
    this.componentType = ComponentType.POWER_SUPPLY;
    this.consumesEnergy = false;
    this.energyValue = energySupplyValue;
  }
}
