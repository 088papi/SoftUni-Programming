package viceCity.models.guns;

import static viceCity.common.ExceptionMessages.*;

public abstract class BaseGun implements Gun{

    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private boolean canFire;

    protected BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        this.setName(name);
        this.setBulletsPerBarrel(bulletsPerBarrel);
        this.setTotalBullets(totalBullets);
        this.setCanFire();
    }

    protected void setCanFire() {

        if (this.totalBullets > 0 ){
            this.canFire = true;
        }
        if (this.bulletsPerBarrel > 0 ){
            this.canFire = true;
        }
        this.canFire = false;
    }

    protected void setTotalBullets(int totalBullets) {
        if (totalBullets < 0){
            throw new IllegalArgumentException(TOTAL_BULLETS_LESS_THAN_ZERO);
        }
        this.totalBullets = totalBullets;
    }

    protected void setBulletsPerBarrel(int bulletsPerBarrel) {
        if (bulletsPerBarrel < 0){
            throw new IllegalArgumentException(BULLETS_LESS_THAN_ZERO);
        }
        this.bulletsPerBarrel = bulletsPerBarrel;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0){
            throw new NullPointerException(NAME_NULL);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }

    @Override
    public boolean canFire() {
        if (bulletsPerBarrel > 1){
            return true;
        }
        if (totalBullets > 1){
            return true;
        }
        return false;
    }

    @Override
    public int getTotalBullets() {
        return this.totalBullets;
    }

}
