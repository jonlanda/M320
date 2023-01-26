package D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InvalidUserException {
        System.out.println("Hello Player!");
        System.out.println("Before you can access your Playstation Store you need to create a new user\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new username:");
        String name = scanner.nextLine();
        System.out.println("How much money do you want to want to deposit on your account?");
        int guthaben = scanner.nextInt();
        User user = new User(name, guthaben);
        UserValidation userValidation = new UserValidation(user);
        userValidation.createUser();
        playstation playstation = new playstation("Playstation 5", 200, user, addGames());
        System.out.println("Hello " + user.getName());
        while (true) {
            System.out.println("Following Games are available in the Playstation Store: \n");
            playstation.getGames();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Which one do you want to buy?");
            String gameName = scan2.nextLine();
            playstation.buyGame(gameName);
        }
    }

    public static List<Games> addGames() {
        Games overwatch = new Games("Overwatch 2", 20, 15, false);
        Games fifa = new Games("Fifa 23", 80, 150, false);
        Games formel1 = new Games("F1 2022", 60, 45, false);
        Games fortnite = new Games("Fortnite", 0, 199, false);
        Games ghost = new Games("Ghost of Tsushima", 120, 35, false);
        List<Games> games = new ArrayList<Games>();
        games.add(overwatch);
        games.add(fifa);
        games.add(formel1);
        games.add(fortnite);
        games.add(ghost);
        return games;
    }
}
