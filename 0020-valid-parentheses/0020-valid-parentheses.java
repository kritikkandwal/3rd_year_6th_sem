class Solution {
    Stack<Character> st=new Stack<>();
    public boolean isValid(String s) {
        for(char ch :s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }
            else if (ch=='{'){
                st.push('}');
            }
            else if(ch=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=ch){
                return false;
            }
        }
        return st.isEmpty();
    }
}








