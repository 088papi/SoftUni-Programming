package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;

import static CounterStriker.common.ExceptionMessages.*;

public abstract class PlayerImpl implements Player {

    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

    protected PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
        this.setIsAlive();
    }

    private void setUsername(String username) {
        if (username == null || username.trim().length() == 0) {
            throw new NullPointerException(INVALID_PLAYER_NAME);
        }

        this.username = username;
    }

    private void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException(INVALID_PLAYER_HEALTH);
        }
        this.health = health;
    }

    private void setArmor(int armor) {
        if (armor < 0) {
            throw new IllegalArgumentException(INVALID_PLAYER_ARMOR);
        }

        this.armor = armor;
    }

    private void setIsAlive() {
        if (this.health < 0) {
            this.isAlive = false;
        }

        this.isAlive = true;
    }

    private void setGun(Gun gun) {
        if (gun == null) {
            throw new NullPointerException(INVALID_GUN);
        }
        this.gun = gun;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void takeDamage(int points) {
        if (this.health > 0) {

            if (this.armor > 0) {
                this.armor -= points;

                if (armor <= 0){

                    this.health -= armor;
                    this.armor = 0;
                }
            } else {
                this.health -= points;
            if (this.health <= 0){
                this.health = 0;
                this.isAlive = false;
            }

            }

        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName())
                .append(": ").append(this.username)
                .append(System.lineSeparator());
        stringBuilder.append("--Health: ").append(this.health)
                .append(System.lineSeparator());
        stringBuilder.append("--Armor: ").append(this.armor)
                .append(System.lineSeparator());
        stringBuilder.append("--Gun: ").append(this.gun.getName());


        return stringBuilder.toString().trim();
    }
}
