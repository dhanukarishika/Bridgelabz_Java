package level1Questions;

class CalculateEarthVolume {
    public static void main(String[] args) {
        double radiusKm=6378;
        double kilometersPerMile=1.6;
        double pi=3.141592653589793;
        double volumeKm=(4/3.0) *pi*radiusKm*radiusKm*radiusKm;
        double radiusMiles=radiusKm/kilometersPerMile;
        double volumeMiles=(4/3.0)*pi*radiusMiles*radiusMiles*radiusMiles;
        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);
    }
}
