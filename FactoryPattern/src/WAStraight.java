public class WAStraight extends SlotMachine {
    public WAStraight()
    {
        cabinet = "large";
        payment = "bills";
        display = "reels";
        gpu = "ARM";
        os = "Linux";
    }

    @Override
    public String getDescription() {
        return ("Straight machine made in WA with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system");
    }
}
