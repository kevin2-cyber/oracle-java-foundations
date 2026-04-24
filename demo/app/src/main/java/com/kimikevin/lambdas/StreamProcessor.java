package com.kimikevin.lambdas;

import java.util.function.*;

record DataPacket(String deviceId, double reading) {}

public class StreamProcessor {
    public static void main(String[] args) {
        Supplier<Double> fetchSensorData = () -> Math.random() * 100;
        Predicate<Double> isAnomaly = reading -> reading > 85;
        Function<Double, DataPacket> packageData = reading ->
                new DataPacket("Sensor-x", reading);
        UnaryOperator<DataPacket> applySecurityFlag = packet ->
                new DataPacket(packet.deviceId() + "-FLAGGED", packet.reading());
        Consumer<DataPacket> alertSystem = packet ->
                System.out.println("CRITICAL ALERT DISPATCHED: " + packet);


        System.out.println("Fetching real-time data...");
        double currentReading = fetchSensorData.get(); // Supplier fires
        System.out.printf("Raw Reading: %.2f\n", currentReading);

        // Check the condition
        if (isAnomaly.test(currentReading)) {          // Predicate fires

            // Transform the data
            DataPacket rawPacket = packageData.apply(currentReading);      // Function fires

            // Modify the data (keeping the same type)
            DataPacket finalPacket = applySecurityFlag.apply(rawPacket);   // Operator fires

            // Output the data
            alertSystem.accept(finalPacket);                               // Consumer fires

        } else {
            System.out.println("Status: Normal. No action required.");
        }
    }
}
