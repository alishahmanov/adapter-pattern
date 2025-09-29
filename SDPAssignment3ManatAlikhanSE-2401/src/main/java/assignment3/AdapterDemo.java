package assignment3;
/**
 * Client code demonstrating the Adapter Pattern in action.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        MetricConverter metricConverter = new MetricConverter();

        // Adapter for meters -> feet
        UnitConverter metersToFeet = new MetricToImperialAdapter(metricConverter, "meters-to-feet");
        System.out.println("10 meters = " + metersToFeet.convert(10) + " feet");

        // Adapter for kilograms -> pounds
        UnitConverter kgToPounds = new MetricToImperialAdapter(metricConverter, "kilograms-to-pounds");
        System.out.println("5 kilograms = " + kgToPounds.convert(5) + " pounds");

        // Adapter for meters -> kilometers (using Adaptee method)
        UnitConverter metersToKm = new MetricToImperialAdapter(metricConverter, "meters-to-kilometers");
        System.out.println("1200 meters = " + metersToKm.convert(1200) + " kilometers");

        // Adapter for kilograms -> grams (using Adaptee method)
        UnitConverter kgToGrams = new MetricToImperialAdapter(metricConverter, "kilograms-to-grams");
        System.out.println("3 kilograms = " + kgToGrams.convert(3) + " grams");
    }
}

