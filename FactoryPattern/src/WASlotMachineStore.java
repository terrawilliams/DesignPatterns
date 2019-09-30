public class WASlotMachineStore extends SlotMachineStore {
    @Override
    protected SlotMachine createSlotMachine(SlotMachineType type) {
        switch (type)
        {
            case Straight:
                return new WAStraight();
            case Bonus:
                return new WABonus();
            case Progressive:
                return new WAProgressive();
            default:
                return null;
        }
    }
}
