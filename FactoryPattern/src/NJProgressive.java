public class NJProgressive extends SlotMachine {
    public NJProgressive()
    {
        cabinet = "small";
        payment = "bills";
        display = "CRT";
        gpu = "X86";
        os = "Windows XP";
    }

    @Override
    public String getDescription() {
        return "Progressive machine made in NJ with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
