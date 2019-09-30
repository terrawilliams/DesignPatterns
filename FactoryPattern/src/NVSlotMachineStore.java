public class NVSlotMachineStore extends SlotMachineStore{
    @Override
    protected SlotMachine createSlotMachine(SlotMachineType type) {
        switch (type)
        {
            case Straight:
                return new NVStraight();
            case Bonus:
                return new NVBonus();
            case Progressive:
                return new NVProgressive();
            default:
                return null;
        }
    }
}
