class Wizard extends Fighter {

  private static final int NORMAL_DAMAGE = 3;
  private static final int SPELL_DAMAGE = 12;

  private boolean isVulnerable = true;
  private boolean hasSpellReady = false;

  public void prepareSpell() {
    hasSpellReady = true;
    isVulnerable = false;
  }

  @Override
  public boolean isVulnerable() {
    return isVulnerable;
  }

  @Override
  public int getDamagePoints(Fighter fighter) {
    if (hasSpellReady) {
      hasSpellReady = false;
      isVulnerable = true;
      return SPELL_DAMAGE;
    }
    return NORMAL_DAMAGE;
  }

  @Override
  public String toString() {
    return "Fighter is a Wizard";
  }
}
