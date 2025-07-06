package week1.dataStructuresAndAlgorithms.financialForecasting;

public class FinancialForecaster {

    // Recursive method to forecast future value
    public static double forecastRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastRecursive(currentValue * growthRate, growthRate, years - 1);
    }

    // Optimized: Using tail recursion logic (or convert to loop)
    public static double forecastIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= growthRate;
        }
        return currentValue;
    }
}

