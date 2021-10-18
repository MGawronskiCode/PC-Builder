import components.*;

public class PCBuilder {
  public static void main(String[] args) {
    User user1 = new User("user1");
    User user2 = new User("user1");

    PC pc1 = new PC("pc1");
    PC pc2 = new PC("pc2");

    ElectricalComponent cpu1 = new CPU("cpu1", 10);
    ElectricalComponent cpu2 = new CPU("cpu2", 100);
    ElectricalComponent ram = new RAM("ram", 10);
    ElectricalComponent ps = new PowerSupply("ps", 30);

    pc1.addComponent(cpu1);
    pc1.addComponent(ram);
    pc1.addComponent(ps);
    System.out.println("should be true: " + pc1.works());

    System.out.println("\n\nshould comunicate no possibility to add");
    pc1.addComponent(cpu2);
    System.out.println("should be true: " + pc1.works());

    pc1.deleteComponent(ComponentType.CPU);
    System.out.println("should be false: " + pc1.works() + "\n\n");
    pc1.addComponent(cpu2);
    System.out.println("should be false: " + pc1.works());

    user1.addPC(pc1);
    user1.addPC(pc2);
    System.out.println("\n\n" + user1.getUserPCs());
  }
}
