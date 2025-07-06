package week1.dataStructuresAndAlgorithms.financialForecasting;

public class ForecastTest {
    public static void main(String[] args) {
        double currentValue = 50000.0;
        double growthRate = 5.10; // 10% growth per year
        int years = 5;

        double futureValueRecursive = FinancialForecaster.forecastRecursive(currentValue, growthRate, years);
        double futureValueIterative = FinancialForecaster.forecastIterative(currentValue, growthRate, years);

        System.out.printf("📈 Recursive Forecast (%.0f at %.0f%% for %d years): ₹%.2f\n",
                currentValue, (growthRate - 1) * 100, years, futureValueRecursive);

        System.out.printf("⚙️ Iterative Forecast: ₹%.2f\n", futureValueIterative);
    }
}
