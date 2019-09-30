public class Main {

    public static void main(String[] args) {
	    SlotMachineStore nvStore = new NVSlotMachineStore();
	    SlotMachineStore njStore = new NJSlotMachineStore();
	    SlotMachineStore waStore = new WASlotMachineStore();

	    System.out.println("Order a Straight Machine from NV:");
	    SlotMachine nvStraight = nvStore.orderSlotMachine(SlotMachineType.Straight);

	    System.out.println("Order a Bonus machine from NJ:");
	    SlotMachine njBonus = njStore.orderSlotMachine(SlotMachineType.Bonus);

	    System.out.println("Order a Progressive machine from WA:");
	    SlotMachine waProgressive = waStore.orderSlotMachine(SlotMachineType.Progressive);
    }
}
