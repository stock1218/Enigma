import java.util.HashMap;

public class Roter {

    private HashMap<Integer, Integer[]> mapping;
    private int position;

    public Roter(String type) {
        mapping = setMapping(type);

    }

    public Roter(String type, int offset) {
        mapping = setMapping(type);
        
        /*plan to create a custom error here
        if (offset < 1)
            throw new IllegalArgumentException("Offset must be more than 0");
        */

        position = offset;

    }

    public char getValue(char input, int Vector) {
        int res = mapping.get((int)input)[Vector];
        return (char) res;
    }

    private HashMap<Integer, Integer[]> setMapping(String type) {
        HashMap<Integer, Integer[]> res = new HashMap<>();
        char[] map = null;
        
        //need to add more roters
        switch (type) {
            case "IC":
                map = new char[] {'D','M','T','W','S','I','L','R','U','Y','Q','N','K','F','E','J','C','A','Z','B','P','G','X','O','H','V'};
                break;
        }

        for (int i = 0; i < map.length; i++) {
            Integer i1 = new Integer(65 + i);
            Integer i2 = new Integer((int)map[i]);


            Integer arg1 = (res.get(i1) != null && res.get(i1)[1] != null) ? res.get(i1)[1] : null;
            Integer arg2 = (res.get(i2) != null && res.get(i2)[0] != null) ? res.get(i2)[0] : null;

            Integer[] array1 = new Integer[] {i2, arg1};
            Integer[] array2 = new Integer[] {arg2, i1};
            
            res.put(i1, array1);
            res.put(i2, array2);

        }

        return res;
    }

}
