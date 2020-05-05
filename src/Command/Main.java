package Command;

import Command.Commands.Command;
import Command.Commands.ScreenDownCommand;
import Command.Commands.ScreenUpCommand;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command up = new ScreenUpCommand(screen);
        Command down = new ScreenDownCommand(screen);
        WallButton b1 = new WallButton(up);
        WallButton b2 = new WallButton(down);
        b1.push();
        b2.push();
    }
}