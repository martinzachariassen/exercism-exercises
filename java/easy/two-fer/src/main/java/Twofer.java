import java.util.Optional;

public class Twofer {

  public String twofer(String name) {
    String resolvedName = Optional.ofNullable(name).orElse("you");
    return String.format("One for %s, one for me.", resolvedName);
  }
}
