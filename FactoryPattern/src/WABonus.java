public class WABonus extends SlotMachine {
    public WABonus()
    {
        cabinet = "medium";
        payment = "ticketinticketout";
        display = "VGA";
        gpu = "ARM";
        os = "Symbian";
    }

    @Override
    public String getDescription() {
        return "Bonus machine made in WA with " + cabinet + " cabinet, " + payment + " payment method, " + display + " display, " + gpu + " GPU, and " + os + " operating system";
    }
}
