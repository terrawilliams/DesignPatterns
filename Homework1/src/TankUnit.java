public class TankUnit extends Unit {

    public TankUnit()
    {
        order = new SelfDestruct();
        weapon = new Laser();

    }
}
