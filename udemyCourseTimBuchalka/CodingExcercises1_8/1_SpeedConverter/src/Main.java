public class Main {
    public static void main(String[] args) {
        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(SpeedConverter.toMilesPerHour(25.24));
        System.out.println(SpeedConverter.toMilesPerHour(75.114));

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.24);
        SpeedConverter.printConversion(75.114);

        System.out.println();
        SpeedConverter.printConversion(0.0);
    }
}