public class NVProgressive extends SlotMachine {
    public NVProgressive()
    {
        cabinet = "medium";
        payment = "ticketinticketout";
        display = "LCD";
        gpu = "X77";
        os = "Android";
    }

    @Override
    public String getDescription() {
        return "Progressive machine made in NV with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
