public class NJSlotMachineStore extends SlotMachineStore{
    @Override
    protected SlotMachine createSlotMachine(SlotMachineType type) {
        switch (type)
        {
            case Straight:
                return new NJStraight();
            case Bonus:
                return new NJBonus();
            case Progressive:
                return new NJProgressive();
            default:
                return null;
        }
    }
}
