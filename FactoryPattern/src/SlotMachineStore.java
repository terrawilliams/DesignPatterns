public abstract class SlotMachineStore {

    public SlotMachine orderSlotMachine(SlotMachineType type)
    {
        SlotMachine machine;
        machine = createSlotMachine(type);

        System.out.println(machine.getDescription());

        return machine;
    }
    protected abstract SlotMachine createSlotMachine(SlotMachineType type);
}
