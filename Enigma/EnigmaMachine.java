import java.util.*;

public class EnigmaMachine {

    private Roter[] roters;
    private Map<Character, Character> plugboard;

    public EnigmaMachine() {
        roters = new Roter[3];

        for(int i = 0; i < roters.length; i++) { 
            roters[i] = new Roter("IC");

        }

        plugboard = new HashMap<>();
    }


    public void addPlug(char c1, char c2) {
    }

    public char encipherLetter(char input) {
        //plugboard
        //roters move
        int turnover = 1;
        for(int i = 0; i < roters.length; i++)  {
            if(turnover > 0) 
                turnover = roters[i].shift();

            System.out.println("Roter: " + i + " AT " + roters[i].getPosition());
        }

        //get enciphered letter
        int pastOffset = 0;
        for(int i = 0; i < roters.length; i++) {
            pastOffset = roters[i].getPosition();
            int res = (int)roters[i].getValue(input, 0) + pastOffset;
            input = (char)res;
        }

        return input;
    }
}
