public abstract class Unit {
    Order order;
    Weapon weapon;

    public void UseWeapon()
    {
        weapon.use();
    }

    public void ExecuteOrder()
    {
        order.execute();
    }

    public void NewWeapon(Weapon newWeapon)
    {
        weapon = newWeapon;
    }

    public void NewOrder(Order newOrder)
    {
        order = newOrder;
    }
}
