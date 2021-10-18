import components.ComponentType;
import components.ElectricalComponent;

import java.util.*;

public class PC {
  private final String name;
  private final Map<ComponentType, ElectricalComponent> components;

  public PC(String name) {
    this.name = name;
    components = new HashMap<>();
  }

  public void addComponent(ElectricalComponent component) {
    ComponentType componentType = component.getComponentType();

    if (components.containsKey(componentType)) {
      System.out.println("this set already contains " + componentType + ", delete it first if you want exchange (new " + componentType + " has NOT been added)");
    } else {
      System.out.println(componentType + " successfully added");
      this.components.put(componentType, component);
    }
  }

  public void deleteComponent(ComponentType componentType) {
    this.components.remove(componentType);
    System.out.println(componentType + " successfully deleted");
  }

  public boolean works() {
    return hasAllComponents() && hasPositivePowerUsage();
  }

  private boolean hasAllComponents() {
    boolean hasAll = components.size() == Arrays.asList(ComponentType.values()).size();
    System.out.println("has all components: " + hasAll);
    return hasAll;
  }

  private boolean hasPositivePowerUsage() {
    int powerUsage = 0;

    List<ElectricalComponent> comp = new ArrayList<>(components.values());
    for (ElectricalComponent actualComponent : comp) {
      if (actualComponent.isConsumesEnergy())
        powerUsage -= actualComponent.getEnergyValue();
      else
        powerUsage += actualComponent.getEnergyValue();
    }
    System.out.println("power usage: " + powerUsage);
    return powerUsage > 0;
  }

  @Override
  public String toString() {
    return "PC{" +
        "name='" + name + '\'' +
        ", components=" + components +
        '}';
  }
}
