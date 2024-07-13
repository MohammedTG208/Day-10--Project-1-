import java.util.*;
//i need to add computer value
// and check if there is value of the index for
// computer add or user
public class Main {
    public static void main(String[] args) {
        TicTacToc();
    }

    static void TicTacToc() {
        int moveCounter=1;
        String[][] ticTac = new String[3][3];
        ticTac[0][0]="1";
        ticTac[0][1]="2";
        ticTac[0][2]="3";
        ticTac[1][0]="4";
        ticTac[1][1]="5";
        ticTac[1][2]="6";
        ticTac[2][0]="7";
        ticTac[2][1]="8";
        ticTac[2][2]="9";
        Scanner input = new Scanner(System.in);
        System.out.println("Start first");
        boolean player=true;
        boolean computer=true;
        do {
            moveCounter++;
            try {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < ticTac.length; j++) {
                        System.out.print(ticTac[i][j]+ " ");
                    }

                    System.out.println();
                }
                System.out.println("========================");
                if (player) {
                    System.out.println("Enter your position");
                    int[] test = userPlayer(input);
                    if (ticTac[test[0]][test[1]].contains("O")){
                        System.out.println("Position already taken. Try again.");
                        continue;
                    }else {
                        ticTac[test[0]][test[1]] = "X";
                        player = false;
                        computer = true;
                    }
                } else if (computer) {
                    int[] computervalue = computer(ticTac);
                    ticTac[computervalue[0]][computervalue[1]] = "O";
                    player = true;
                    computer = false;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (isWinner(ticTac,moveCounter));
    }

    static int[] computer(String [][] checkIndex) {
        boolean Stop = false;
        int[] positionCoump = new int[2];
        Random position = new Random();
        do {
            positionCoump[0] = position.nextInt(3);
            positionCoump[1] = position.nextInt(3);
            String check = checkIndex [positionCoump[0]] [positionCoump[1]];
            if (check.contains("X")||check.contains("O")){
                Stop=true;
            }else {
                Stop=false;
            }

        } while (Stop);
        return positionCoump;
    }

    static int[] userPlayer(Scanner input)throws Exception {
        int userInput=0;
        int[] position=new int[2];
        try {
             userInput = input.nextInt();
            if (userInput > 10) {
                throw new Exception("Enter number from 1-10 not " + userInput);
            } else if (userInput <= 0) {
                throw new Exception("Enter number from 1-10 not " + userInput);
            } else {
                switch (userInput){
                    case 1:
                        position[0]=0;
                        position[1]=0;
                        return position;
                    case 2:
                        position[0]=0;
                        position[1]=1;
                        return position;
                    case 3:
                        position[0]=0;
                        position[1]=2;
                        return position;
                    case 4:
                        position[0]=1;
                        position[1]=0;
                        return position;
                    case 5:
                        position[0]=1;
                        position[1]=1;
                        return position;
                    case 6:
                        position[0]=1;
                        position[1]=2;
                        return position;
                    case 7:
                        position[0]=2;
                        position[1]=0;
                        return position;
                    case 8:
                        position[0]=2;
                        position[1]=1;
                        return position;
                    case 9:
                        position[0]=2;
                        position[1]=2;
                        return position;
                    default:
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Numbers only");
        }
        return position;
    }

    static boolean isWinner(String[][] howWinner ,int counter) {
        if (howWinner[0][0].contains("X") && howWinner[1][1].contains("X") && howWinner[2][2].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][0].contains("X") && howWinner[0][1].contains("X") && howWinner[0][2].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][0].contains("O") && howWinner[0][1].contains("O") && howWinner[0][2].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[0][0].contains("O") && howWinner[1][1].contains("O") && howWinner[2][2].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[1][0].contains("X") && howWinner[1][1].contains("X") && howWinner[1][2].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[1][0].contains("O") && howWinner[1][1].contains("O") && howWinner[1][2].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[2][0].contains("X") && howWinner[2][1].contains("X") && howWinner[2][2].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[2][0].contains("O") && howWinner[2][1].contains("O") && howWinner[2][2].contains("O")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][2].contains("X") && howWinner[1][1].contains("X") && howWinner[2][0].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][2].contains("O") && howWinner[1][1].contains("O") && howWinner[2][0].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[0][2].contains("O") && howWinner[1][2].contains("O") && howWinner[2][2].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[0][2].contains("X") && howWinner[1][2].contains("X") && howWinner[2][2].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][0].contains("X") && howWinner[1][0].contains("X") && howWinner[2][0].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][0].contains("O") && howWinner[1][0].contains("O") && howWinner[2][0].contains("O")) {
            System.out.println("O Winner");
            return false;
        } else if (howWinner[0][1].contains("X") && howWinner[1][1].contains("X") && howWinner[2][1].contains("X")) {
            System.out.println("X Winner");
            return false;
        } else if (howWinner[0][1].contains("O") && howWinner[1][1].contains("O") && howWinner[2][1].contains("O")) {
            System.out.println("O Winner");
            return false;
        }else {
           if (counter>9){
               System.out.println("Draw");
               return false;
           }

        }

        return true;
    }
}

