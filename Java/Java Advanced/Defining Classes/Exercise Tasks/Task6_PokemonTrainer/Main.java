import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] data = input.split("\\s+");
            String trainerName = data[0];

            Pokemon pokemon = setPokemon(data);
            addTrainerToMap(trainerMap, pokemon, trainerName);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            String wantedElement = input;

            trainerMap.forEach((name, currentTrainer) -> {
                boolean hasElement = false;

                for (Pokemon pokemon : currentTrainer.getPokemonList()) {

                    if (pokemon.getElement().equals(wantedElement)) {
                        hasElement = true;
                        break;
                    }
                }
                if (hasElement) {
                    currentTrainer.setBadges(currentTrainer.getBadges() + 1);
                } else {
                    if (!currentTrainer.getPokemonList().isEmpty()) {
                        for (Pokemon pokemon : currentTrainer.getPokemonList()) {
                            pokemon.setHealth(pokemon.getHealth() - 10);
                            if (pokemon.getHealth() <= 0) {
                                currentTrainer.getPokemonList().remove(pokemon);
                                    break;
                                }
                            }
                        }
                    }

            });

            input = scanner.nextLine();
        }

      trainerMap.entrySet().stream().sorted((trainer1,trainer2)-> Integer.compare(
              trainer2.getValue().getBadges(),
              trainer1.getValue().getBadges()))
              .forEach(trainer -> System.out.println(trainer.getValue().toString()));


    }

    private static void addTrainerToMap(Map<String, Trainer> trainerMap, Pokemon pokemon, String trainerName) {
        Trainer trainer;
        if (trainerMap.containsKey(trainerName)) {
            trainerMap.get(trainerName).getPokemonList().add(pokemon);
        } else {
            List<Pokemon> pokemonList = new ArrayList<>();
            pokemonList.add(pokemon);

            trainer = new Trainer(trainerName, pokemonList);
            trainerMap.put(trainerName, trainer);

        }
    }

    private static Pokemon setPokemon(String[] data) {
        String pokemonName = data[1];
        String element = data[2];
        int health = Integer.parseInt(data[3]);
        return new Pokemon(pokemonName, element, health);

    }
}
