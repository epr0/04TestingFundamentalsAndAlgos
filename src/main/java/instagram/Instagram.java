package instagram;

public class Instagram {

    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        System.out.printf(instagram.createTimeAgoString(5));
    }

    public String createTimeAgoString(int minutes) {
        return minutes + " minutes ago.";
    }
}
