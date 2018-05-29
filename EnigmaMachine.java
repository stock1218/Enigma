public class EnigmaMachine {

    List<Roter> roters;
    Map<Character, Character> plugboard;

    public EnigmaMachine() {
        roters = new ArrayList<>();
        for(int i = 0; i < 3; i ++) { roters.add(new Roter());}

        plugboard = new HashMap<>();
    }


    public void addRoter() {
        roters.add(new Roter());
    }

    public void addPlug(char c1, char c2) {
        plugboard.set(c1, c2);
    }

}
