public class NJStraight extends SlotMachine {
    public NJStraight ()
    {
        cabinet = "small";
        payment = "coins";
        display = "LCD";
        gpu = "ARM";
        os = "Windows ME";
    }

    @Override
    public String getDescription() {
        return "Straight machine made in NJ with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
