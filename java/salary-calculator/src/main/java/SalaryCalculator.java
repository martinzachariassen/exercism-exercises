public class SalaryCalculator {
    private static final int MAX_SALARY = 2000;
    private static final double BASE_SALARY = 1000;
    private static final int BONUS_THRESHOLD = 20;
    private static final int LOW_BONUS_RATE = 10;
    private static final int HIGH_BONUS_RATE = 13;
    private static final int SKIPPED_DAYS_THRESHOLD = 5;
    private static final double REDUCED_SALARY_MULTIPLIER = 0.85;
    private static final double FULL_SALARY_MULTIPLIER = 1.0;

    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped < 0) {
            throw new IllegalArgumentException("Days skipped cannot be negative");
        }
        return daysSkipped < SKIPPED_DAYS_THRESHOLD ? FULL_SALARY_MULTIPLIER : REDUCED_SALARY_MULTIPLIER;
    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold < 0) {
            throw new IllegalArgumentException("Products sold cannot be negative");
        }
        return productsSold < BONUS_THRESHOLD ? LOW_BONUS_RATE : HIGH_BONUS_RATE;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = salaryMultiplier(daysSkipped) * BASE_SALARY;
        double totalBonus = bonusForProductsSold(productsSold);
        double salaryWithBonus = baseSalary + totalBonus;
        return salaryWithBonus > MAX_SALARY ? MAX_SALARY : salaryWithBonus;
    }
}
