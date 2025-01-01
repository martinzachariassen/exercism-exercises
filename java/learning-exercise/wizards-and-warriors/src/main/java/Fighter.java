class Fighter {

  protected boolean isVulnerable() {
    return true;
  }

  protected int getDamagePoints(Fighter fighter) {
    return 1;
  }

  @Override
  public String toString() {
    return "Fighter";
  }
}
