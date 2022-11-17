public class Sponsor {

    private final String sponsorName;
    private int supportSum;

    private static final String DEFAULT_VALUE = "default";



    public Sponsor(String sponsorName, int supportSum) {
        this.sponsorName = ValidationUtils.validOrDefault(sponsorName, DEFAULT_VALUE);
        setSupportSum(supportSum);
    }

    public void supportRace() {
        System.out.println(getSponsorName() + " спонсирует заезд.");
    }

    public String toString() {
        return "Спонсор " + getSponsorName() + " оказывает поддержку на сумму " + getSupportSum() + " рублей.";
    }

    public String getSponsorName() {
        return sponsorName;
    }


    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(int supportSum) {
        this.supportSum = supportSum > 0 ? supportSum : 50_000;
    }
}
