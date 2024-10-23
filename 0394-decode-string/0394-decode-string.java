class Solution {
    public String decodeString(String s) {
         Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
                count = 0;
            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}