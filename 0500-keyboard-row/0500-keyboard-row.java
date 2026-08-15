class Solution {
    public String[] findWords(String[] words) {
        //StringBuilder sr= new StringBuilder();
       String[] stringarray=new String[words.length];
       int q=0;
        for(int i=0;i<words.length;i++){ 
            int line1=0;
            int line2=0;
            int line3=0;
            String p=words[i];
            p=p.toLowerCase();
            for(int j=0;j<p.length();j++){
                  if (p.charAt(j) == 'q' || p.charAt(j) == 'w' ||
                    p.charAt(j) == 'e' || p.charAt(j) == 'r' ||
                    p.charAt(j) == 't' || p.charAt(j) == 'y' ||
                    p.charAt(j) == 'u' || p.charAt(j) == 'i' ||
                    p.charAt(j) == 'o' || p.charAt(j) == 'p') {
                    line1++;
                }

                if (p.charAt(j) == 'a' || p.charAt(j) == 's' ||
                    p.charAt(j) == 'd' || p.charAt(j) == 'f' ||
                    p.charAt(j) == 'g' || p.charAt(j) == 'h' ||
                    p.charAt(j) == 'j' || p.charAt(j) == 'k' ||
                    p.charAt(j) == 'l') {
                    line2++;
                }

                if (p.charAt(j) == 'z' || p.charAt(j) == 'x' ||
                    p.charAt(j) == 'c' || p.charAt(j) == 'v' ||
                    p.charAt(j) == 'b' || p.charAt(j) == 'n' ||
                    p.charAt(j) == 'm') {
                    line3++;
                }
            }
             if (line1 == p.length() ||
                line2 == p.length() ||
                line3 == p.length()) {

                stringarray[q] = words[i];
                q++;
            }
            }
        return Arrays.copyOf(stringarray, q);
    }
}