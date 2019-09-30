public class NJBonus extends SlotMachine {
    public NJBonus()
    {
        cabinet = "large";
        payment = "coins";
        display = "reels";
        gpu = "ARM";
        os = "Windows ME";
    }

    @Override
    public String getDescription() {
        return "Bonus machine made in NJ with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
