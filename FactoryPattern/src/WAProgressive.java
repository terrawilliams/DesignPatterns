public class WAProgressive extends SlotMachine {
    public WAProgressive()
    {
        cabinet = "large";
        payment = "coins";
        display = "reels";
        gpu = "ARM";
        os = "Android";
    }

    @Override
    public String getDescription() {
        return "Progressive machine made in WA with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
