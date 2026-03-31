public class EarthVolume {
    public static void main(String[] args) {
        int radius=6378;// radius of earth in kilometers
        double volume= (4/3.0) * (22/7.0) * Math.pow(radius, 3);// volume of sphere formula
        double volumeInMiles= volume * Math.pow(1.6,3);// converting cubic kilometers to cubic miles
        System.out.println("The volume of the Earth in cubic kilometers is: "+ volume +" and cubic miles is: "+ volumeInMiles +".");
    }
}
