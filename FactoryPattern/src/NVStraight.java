public class NVStraight extends SlotMachine {
    public NVStraight()
    {
        cabinet = "large";
        payment = "ticketinticketout";
        display = "reels";
        gpu = "ARM";
        os = "Linux";
    }

    @Override
    public String getDescription() {
        return "Straight machine made in NV with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
