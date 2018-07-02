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
            case "IIC":
                map = new char[] {'H','Q','Z','G','P','J','T','M','O','B','L','N','C','I','F','D','Y','A','W','V','E','U','S','R','K','X'};
                break;
            
            case "IIIC":
                map = new char[] {'U','Q','N','T','L','S','Z','F','M','R','E','H','D','P','X','K','I','B','V','Y','G','J','C','W','O','A'};
                break;

            case "I":
                map = new char[] {'J','G','D','Q','O','X','U','S','C','A','M','I','F','R','V','T','P','N','E','W','K','B','L','Z','Y','H'};
                break;

            case "II":
                map = new char[] {'N','T','Z','P','S','F','B','O','K','M','W','R','C','J','D','I','V','L','A','E','Y','U','X','H','G','Q'};
                break;

            case "III":
                map = new char[] {'J','V','I','U','B','H','T','C','D','Y','A','K','E','Q','Z','P','O','S','G','X','N','R','M','W','F','L'};
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
