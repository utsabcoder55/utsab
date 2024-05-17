class Solution {
    public static boolean map[] = new boolean[26];
    public static String removeDuplicateLetters(String s) {
       
        char currChar;
        String newStr = "";
        for(int i =0;i<s.length();i++ ){
            currChar = s.charAt(i);
            if(map[currChar - 'a'] == true){

            }
            else{
                newStr += currChar;
                map[currChar - 'a'] = true;
            }
        }
        return newStr;
        
        }
        public static void main(String[] args) {
            String newStr = removeDuplicateLetters("cbacdcbc");
            System.out.println(newStr);
        }
        }
