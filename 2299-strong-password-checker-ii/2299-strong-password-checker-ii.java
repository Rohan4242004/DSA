class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;

        String schar = "!@#$%^&*()-+";
        char prev = ' '; /// We made prev(pervious) char so that we can check that two adjacent character are same or not

        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);

            if(ch == prev){
                return false;
            }
            prev = ch;

            if(Character.isLowerCase(ch)){
                lower = true;
            }else if(Character.isUpperCase(ch)){
                upper = true;
            }else if(Character.isDigit(ch)){
                digit = true;
            }else if(schar.indexOf(ch) != -1){
                special = true;
            }
        }
        if(password.length() >=8 && lower && upper && digit && special){
            return true;
        }
        return false;
    }
}