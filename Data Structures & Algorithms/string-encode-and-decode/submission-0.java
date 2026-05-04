class Solution {


// Encode:
// Get the length of the string
// Append length + "#" + string to the result

// Decode:
// Read characters until "#" → that's the length
// Read exactly length characters after "#" → that's the string
// Move position to right after the last character read
// Add extracted string to a list

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            String value = str.substring(j + 1, j + 1 + length);
            result.add(value);
            i = j + 1 + length;
        }
        return result;
    }
}
