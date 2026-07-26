class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            int row = -1;

            for (int j = 0; j < 3; j++) {
                if (rows[j].indexOf(word.charAt(0)) != -1) {
                    row = j;
                    break;
                }
            }

            boolean valid = true;

            for (int j = 1; j < word.length(); j++) {
                if (rows[row].indexOf(word.charAt(j)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}