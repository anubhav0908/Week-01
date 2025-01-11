public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Given radius of the Earth in kilometers
        double radiusKm = 6378;

        // Volume of a sphere formula: (4/3) * pi * r^3
        double volumeKmCubed = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Conversion factor from cubic kilometers to cubic miles
        double kmToMilesCubed = 0.239913;

        // Convert the volume in cubic kilometers to cubic miles
        double volumeMilesCubed = volumeKmCubed * kmToMilesCubed;

        // Output the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKmCubed + " and cubic miles is " + volumeMilesCubed);
    }
}
