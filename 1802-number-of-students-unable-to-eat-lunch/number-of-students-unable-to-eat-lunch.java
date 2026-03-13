class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i:students){
            q.add(i);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count=0;
        while(!q.isEmpty()){
            if(st.peek().equals(q.peek())){
                st.pop();
                q.poll();
                count=0;
            }
            else{
                q.add(q.poll());
                count++;
                if(count==q.size()){
                    return count;
                }
            }
        }
        return q.size();

    }
}