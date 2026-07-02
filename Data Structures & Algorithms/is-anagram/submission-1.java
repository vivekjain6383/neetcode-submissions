class Solution {

    public Map<Character,Integer> freq(String s){
        Map<Character, Integer> m = new HashMap<>();
        char[] ch = s.toCharArray();
        for(Character c: ch){
            m.put(c, m.getOrDefault(c, 0) + 1);
        }return m;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<Character, Integer> m = freq(s);
        Map<Character, Integer> m1 = freq(t);
        // for(int i=0;i<t.length();i++){
        //     if(m.get(t.charAt(i))!=m1.get(t.charAt(i)))return false;
        // }
        return m.equals(m1);
    }
}
