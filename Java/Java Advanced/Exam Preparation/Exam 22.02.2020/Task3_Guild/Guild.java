package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private int capacity;
    private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player){
        if (roster.size() < capacity){
            roster.add(player);
        }
    }

    public boolean removePlayer(String name){

        for (Player player : roster) {
            if (player.getName().equals(name)){

                roster.remove(player);
                return true;
            }
        }
        return false;
    }

    public void promotePlayer(String name){
        for (Player player : roster) {
            if (player.getName().equals(name)){
                    player.setRank("Member");
                    break;
            }
        }

    }

    public void demotePlayer(String name){
        for (Player player : roster) {
            if (player.getName().equals(name)){
                    player.setRank("Trial");
                    break;
                }
            }
        }



    public Player[] kickPlayersByClass(String clazz){




        Player[] arr = roster.stream().filter(e -> e.getClazz().equals(clazz))
                .toArray(Player[]::new);

            roster.removeIf(e -> e.getClazz().equals(clazz));

        return arr;
    }

    public int count(){
        return this.roster.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Players in the guild: ").append(this.name).append(":").append(System.lineSeparator());
        for (Player player : roster) {
            sb.append(player.toString()).append(System.lineSeparator());
        }

        return sb.toString();
    }


}
