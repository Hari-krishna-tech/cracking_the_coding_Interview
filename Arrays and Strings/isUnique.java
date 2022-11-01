public class isUnique {
    public static void main(String[] args) {
        // there are 128 characters in normal ascii table
        // there are 256 characters in extended ascii table
        // for simplicity we take 128 characters
        String word = "hari";
        
        // if our sentence exceed 128 letters it should contain repeated characters
        if (word.length() > 128) {
            System.out.println("false");
            return;
        }
        boolean[] char_set = new boolean[128];
        // 
        for(int i= 0; i < word.length(); i++) {
            int val = word.charAt(i);
            if (char_set[val]) {
                System.out.println("false");
                return;
            }
            char_set[val] = true;
        }
        System.out.println("true");
    }
}