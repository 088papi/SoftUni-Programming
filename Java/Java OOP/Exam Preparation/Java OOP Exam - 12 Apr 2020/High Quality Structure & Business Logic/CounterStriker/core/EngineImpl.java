package CounterStriker.core;

import CounterStriker.common.Command;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static CounterStriker.common.ExceptionMessages.INVALID_GUN_TYPE;
import static CounterStriker.common.OutputMessages.SUCCESSFULLY_ADDED_GUN;
import static CounterStriker.common.OutputMessages.SUCCESSFULLY_ADDED_PLAYER;

public class EngineImpl implements Engine {
    private Controller controller;
    private BufferedReader reader;

    public EngineImpl() {
        this.controller = new ControllerImpl();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        while (true) {
            String result = null;
            try {
                result = processInput();

                if (result.equals(Command.Exit.name())) {
                    break;
                }

            } catch (IOException | IllegalArgumentException | NullPointerException e) {
                result = e.getMessage();
            }

            System.out.println(result);
        }
    }

    private String processInput() throws IOException {
        String input = this.reader.readLine();
        String[] tokens = input.split("\\s");

        Command command = Command.valueOf(tokens[0]);
        String[] data = Arrays.stream(tokens).skip(1).toArray(String[]::new);

        String result = null;

        switch (command) {
            case AddPlayer:
                result = this.addPlayer(data);
                break;
            case Exit:
                result = Command.Exit.name();
                break;
            case StartGame:
                result = this.start();
                break;
            case Report:
                result = this.report();
                break;
            case AddGun:
                result = this.addGun(data);
                break;
        }

        return result;
    }

    private String addGun(String[] data) {
        this.controller.addGun(data[0],data[1],Integer.parseInt(data[2]));
        return String.format(SUCCESSFULLY_ADDED_GUN, data[1]);
    }

    private String report() {
        return controller.report();
    }

    private String addPlayer(String[] data) {
        this.controller.addPlayer(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4]);
        return String.format(SUCCESSFULLY_ADDED_PLAYER, data[1]);
    }

    private String start() {

        return controller.startGame();
    }
}
