import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            getInput();
            String u = s.next();
            if(u.equals("r") || u.equals("p") || u.equals("s")) {
                String result = checkWinner(u);
                if(!result.equals("tie")){
                    gameOver = true;
                    System.out.println("You " + result + "!");
                }
            } else {
                getInput();
            }

        }
        s.close();
    }

    public static void getInput() {
        System.out.println("Rock, paper, or scissors? (r/p/s)");
    }

    public static String checkWinner(String u) {
        String[] choices= {"r", "p", "s"};
        String comp = choices[(int) (Math.random()*3)];
        System.out.println("Computer choice: " + comp);
        if(u.equals(comp)){
            return "tie";
        } else if (u.equals("r") && (comp.equals("s"))){
            return "win";
        } else if (u.equals("s") && (comp.equals("r"))) {
            return "lose";
        } else if (u.equals("r") && (comp.equals("p"))){
            return "lose";
        } else if (u.equals("p") && (comp.equals("r"))){
            return "win";
        } else if (u.equals("s") && (comp.equals("p"))){
            return "win";
        } else {
            return "lose";
        }
    }
}