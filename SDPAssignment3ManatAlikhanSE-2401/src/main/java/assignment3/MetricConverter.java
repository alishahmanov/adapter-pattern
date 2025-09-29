package assignment3;
/**
 * Adapter class.
 * Works only with Metric system and has its own methods.
 */
public class MetricConverter {

    // Converts meters to kilometers
    public double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    // Converts kilograms to grams
    public double kilogramsToGrams(double kilograms) {
        return kilograms * 1000.0;
    }
}

