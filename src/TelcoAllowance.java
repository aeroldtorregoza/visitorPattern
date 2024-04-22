public class TelcoAllowance implements UsagePromo{
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + " Data Usage Offer and price: ₱" + money + " per month.";
    }
}
