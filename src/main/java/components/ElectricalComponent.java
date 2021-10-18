package components;

import lombok.Getter;

public abstract class ElectricalComponent {
  protected final String name;
  @Getter
  protected boolean consumesEnergy;
  @Getter
  protected int energyValue;
  @Getter
  protected ComponentType componentType;

  public ElectricalComponent(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ElectricalComponent{" +
        "name='" + name + '\'' +
        ", consumesEnergy=" + consumesEnergy +
        ", energyValue=" + energyValue +
        ", componentType=" + componentType +
        '}';
  }
}
