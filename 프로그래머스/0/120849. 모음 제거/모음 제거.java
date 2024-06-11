class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] mo = {"a","e","i","o","u"};
        for (int i=0;i<my_string.length();i++) {
            boolean moeum = false;
            for (String m : mo) {
                if (m.equals(String.valueOf(my_string.charAt(i)))) {
                    moeum = true;
                }
            }
            if (!moeum) {
                sb.append(String.valueOf(my_string.charAt(i)));
            }
        }
        return sb.toString();
    }
}