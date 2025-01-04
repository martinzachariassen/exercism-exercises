import java.util.Optional;

class Badge {
  public String print(Integer id, String name, String department) {
    String optIdStr = Optional.ofNullable(id)
        .map(value -> "[" + value + "] - ")
        .orElse("");

    String departmentStr = Optional.ofNullable(department)
        .orElse("OWNER")
        .toUpperCase();

    return optIdStr + name + " - " + departmentStr;
  }
}
