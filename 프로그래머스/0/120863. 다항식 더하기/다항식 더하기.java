class Solution {
    public String solution(String polynomial) {
        String[] poly = polynomial.split(" ");
        int x = 0;
        int num = 0;
        for (String p : poly) {
            if (p.contains("x")) {
                String convertP = p.replace("x", "");
                if ("".equals(convertP)) {
                    x+=1;
                } else {
                    x += Integer.parseInt(convertP);
                }
            } else if (!"+".equals(p)) {
                num += Integer.parseInt(p);
            } 
        }
        StringBuilder answer = new StringBuilder();
        if (x > 0) {
            if (x == 1) {
                answer.append("x");
            } else {
                answer.append(x).append("x");
            }               
        }
        if (num > 0) {
            if (x > 0) {
                answer.append(" + ");
            }
            answer.append(num);
        }
        return answer.toString();
    }
}