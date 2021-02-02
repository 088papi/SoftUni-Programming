import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int badges = 0;
    private List<Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = pokemonList;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }



    @Override
    public String toString(){

        return String.format("%s %d %d", this.name, this.badges, this.pokemonList.size());
    }
}

