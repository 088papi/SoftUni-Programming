package viceCity.models.guns;

public class Rifle extends BaseGun{

    public static int BULLETS_PER_BARREL = 50;
    public static int TOTAL_BULLETS = 500;

    public Rifle(String name) {
        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        return 0;
    }
}
