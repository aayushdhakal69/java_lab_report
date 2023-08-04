import java.util.Scanner;

class Game1 {
int luck = 0;

int temp() {
return (int) ((Math.random() * 100) + 1);
}

public void play() {
Scanner sc = new Scanner(System.in);
System.out.println("Do you want to play the game to check your luck?");
System.out.println("Enter 'y' for yes and 'n' for no:");
char choice = sc.next().toLowerCase().charAt(0);

if (choice == 'y') {
System.out.println("Welcome to the Luck Game!");
System.out.println("Answer each question with 'y' for yes and 'n' for no.");
System.out.println("Let's begin!");
} else {
System.out.println("Okay, maybe next time! Goodbye!");
System.exit(0);
}

// Questions
System.out.println("Q1) Did you wake up earlier than 5 o'clock?");
luck += (sc.next().toLowerCase().charAt(0) == 'y') ? temp() : 0;

System.out.println("Q2) Were you born in Nepal?");
luck += (sc.next().toLowerCase().charAt(0) == 'y') ? temp() : 0;

System.out.println("Q3) What's your lucky number?");
luck += (sc.nextInt() + temp());

System.out.println("Q4) Can you take a break from social networks for a day?");
luck += (sc.next().toLowerCase().charAt(0) == 'y') ? temp() : 0;

System.out.println("Q5) Did you lie after you woke up today?");
luck += (sc.next().toLowerCase().charAt(0) == 'y') ? temp() : 0;

sc.close();

// Calculate luck
int change = (luck >= 1 && luck <= 100) ? 5 : (luck > 100 && luck <= 200) ? 4 : (luck > 200 && luck <= 300) ? 3
: (luck > 300 && luck < 400) ? 2 : 1;

// Output luck result
switch (change) {
case 1-> System.out.printf("Today you are super lucky! Score: %d", luck);
case 2-> System.out.printf("Today you are lucky! Score: %d", luck);
case 3-> System.out.printf("Today you are quite lucky! Score: %d", luck);
case 4-> System.out.printf("Today you are lucky! Score: %d", luck);
case 5-> System.out.printf("Today you are less lucky! Score: %d", luck);
}
}
}

public class add_qn_4 {

public static void main(String[] args) {

Game1 game = new Game1();
game.play();
}
}