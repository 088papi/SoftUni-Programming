package viceCity.models.guns;

public class Pistol extends BaseGun {


    public Pistol(String name) {
        super(name, 10, 100);
    }

    @Override
    public int fire() {


        if (super.getBulletsPerBarrel() < 1) {
            super.setBulletsPerBarrel(0);
            if (super.getTotalBullets() < 0) {
                super.setTotalBullets(0); ;
                setCanFire();
                return 0;
            } else {
                int bulletsPerBarrel = super.getBulletsPerBarrel();
                super.setBulletsPerBarrel(bulletsPerBarrel+=10);
                int totalBullets = super.getTotalBullets();
                super.setTotalBullets(totalBullets-=10);
                return 1;
            }
        }
        int bulletsPerBarrel = super.getBulletsPerBarrel();
        super.setBulletsPerBarrel(bulletsPerBarrel-=1);

        return 1;
    }
}
