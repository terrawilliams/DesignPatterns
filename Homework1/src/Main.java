public class Main {

    public static void main(String[] args) {
        Unit grunt = new GruntUnit();
        Unit tank = new TankUnit();

        grunt.ExecuteOrder();
        tank.ExecuteOrder();

        grunt.UseWeapon();
        tank.UseWeapon();

        grunt.NewWeapon(new Pistol());
        tank.NewWeapon(new Rocket());

        grunt.UseWeapon();
        tank.UseWeapon();

        grunt.NewOrder(new Flee());
        tank.NewOrder(new Defend());

        grunt.ExecuteOrder();
        tank.ExecuteOrder();
    }
}
