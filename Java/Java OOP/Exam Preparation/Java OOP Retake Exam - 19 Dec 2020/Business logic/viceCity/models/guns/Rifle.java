package viceCity.models.guns;

public class Rifle extends BaseGun{

    public static int BULLETS_PER_BARREL = 50;
    public static int TOTAL_BULLETS = 500;

    public Rifle(String name) {
        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        if (BULLETS_PER_BARREL < 5) {
            BULLETS_PER_BARREL = 0;
            if (TOTAL_BULLETS < 0) {
                TOTAL_BULLETS = 0;
                super.setCanFire();
                return 0;
            } else {
                BULLETS_PER_BARREL += 50;
                TOTAL_BULLETS -= 50;
                return 5;
            }
        }
        return 5;
    }
}
