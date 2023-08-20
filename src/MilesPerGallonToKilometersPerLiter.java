public class MilesPerGallonToKilometersPerLiter {
    public static float mpgToKPM(final float mpg) {
        float mile = 1.609344f;
        float litres = 4.54609188f;
        return Math.round(mpg * (mile / litres) * 100.0f) / 100.0f;
    }
}
