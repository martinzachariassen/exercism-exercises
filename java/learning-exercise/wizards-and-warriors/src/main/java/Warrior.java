class Warrior extends Fighter {

  private static final int NORMAL_DAMAGE = 6;
  private static final int DAMAGE_AGAINST_VULNERABLE_TARGET = 10;

  @Override
  protected boolean isVulnerable() {
    return false;
  }

  @Override
  protected int getDamagePoints(Fighter fighter) {
    return fighter.isVulnerable() ? DAMAGE_AGAINST_VULNERABLE_TARGET : NORMAL_DAMAGE;
  }

  @Override
  public String toString() {
    return "Fighter is a Warrior";
  }
}
