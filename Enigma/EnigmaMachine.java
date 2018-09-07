import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class EnigmaMachine {

    private List<Rotor> rotors;
    private Map<Character, Character> plugboard;

    public EnigmaMachine() {
        rotors = new ArrayList<>();
        for(int i = 0; i < 3; i ++) { rotors.add(new Rotor("IC"));}

        plugboard = new HashMap<>();
    }


    public void addRotor() {
        rotors.add(new Rotor("IC"));
    }

    public void addPlug(char c1, char c2) {
        plugboard.put(c1, c2);
    }

}
