public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return cap - on- wait >= 0 ? 0 : Math.abs(cap - on- wait);
    }
}
