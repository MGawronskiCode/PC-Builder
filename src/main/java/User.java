import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class User {
  @Getter
  private final List<PC> userPCs;
  private final String name;

  public User(String name) {
    this.name = name;
    this.userPCs = new ArrayList<>();
  }

  public void addPC(PC pc) {
    userPCs.add(pc);
  }

  @Override
  public String toString() {
    return "User{" +
        "userPCs=" + userPCs +
        ", name='" + name + '\'' +
        '}';
  }
}
