public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text package: " + (unliCallText ? "Included" : "Not included");
    }
}
