package assignment3;


/**
 * Adapter class.
 * Implements UnitConverter and uses MetricConverter internally.
 */
public class MetricToImperialAdapter implements UnitConverter {

    private final MetricConverter metricConverter;
    private final String conversionType;

    public MetricToImperialAdapter(MetricConverter metricConverter, String conversionType) {
        this.metricConverter = metricConverter;
        this.conversionType = conversionType;
    }

    @Override
    public double convert(double value) {
        switch (conversionType.toLowerCase()) {
            case "meters-to-feet":
                return value * 3.28084; // 1 meter = 3.28084 feet
            case "kilograms-to-pounds":
                return value * 2.20462; // 1 kg = 2.20462 lbs
            case "meters-to-kilometers":
                return metricConverter.metersToKilometers(value);
            case "kilograms-to-grams":
                return metricConverter.kilogramsToGrams(value);
            default:
                throw new UnsupportedOperationException("Conversion type not supported: " + conversionType);
        }
    }
}

