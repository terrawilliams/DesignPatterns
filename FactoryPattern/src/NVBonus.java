public class NVBonus extends SlotMachine {
    public NVBonus()
    {
        cabinet = "small";
        payment = "ticketinticketout";
        display = "CRT";
        gpu = "X86";
        os = "Linux";
    }

    @Override
    public String getDescription() {
        return "Bonus machine made in NV with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
