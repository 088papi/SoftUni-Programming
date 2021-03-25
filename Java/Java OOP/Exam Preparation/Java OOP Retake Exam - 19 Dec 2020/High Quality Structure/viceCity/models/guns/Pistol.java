package viceCity.models.guns;

public class Pistol extends BaseGun{

    public static int BULLETS_PER_BARREL = 10;
    public static int TOTAL_BULLETS = 100;

    public Pistol(String name, int bulletsPerBarrel, int totalBullets) {
        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        return 0;
    }
}
