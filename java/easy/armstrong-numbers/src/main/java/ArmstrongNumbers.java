
class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    String numbersAsString = String.valueOf(numberToCheck);
    int numberOfDigits = numbersAsString.length();

    int sum = numbersAsString.chars()
        .map(Character::getNumericValue)
        .map(digit -> (int) Math.pow(digit, numberOfDigits))
        .sum();

    return sum == numberToCheck;
  }
}
