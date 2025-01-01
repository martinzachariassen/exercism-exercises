class Fighter {

  public boolean isVulnerable() {
    return true;
  }

  public int getDamagePoints(Fighter fighter) {
    return 1;
  }

  @Override
  public String toString() {
    return "Fighter";
  }
}
