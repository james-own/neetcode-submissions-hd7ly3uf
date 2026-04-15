class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) {
        return false;
      }

      Map<Character, Integer> map1 = new HashMap<>();
      Map<Character, Integer> map2 = new HashMap<>();

      for(char c : s.toCharArray()) {
        map1.put(c, map1.getOrDefault(c, 0) + 1);
      }

      for (char c : t.toCharArray()) {
        map2.put(c, map2.getOrDefault(c, 0) + 1);
      }

      for(Character key: map1.keySet()) {
         if(!map2.containsKey(key)) {
            return false;
         }

         if(!map1.get(key).equals(map2.get(key))) {
            return false;
         }
      }
      return true;
    }
}
