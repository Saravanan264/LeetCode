class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean [] visited = new boolean[n];
        dfs(rooms,visited,0);
        for(boolean i:visited){
            if(!i){
                return false;
            }
        }
        return true;
    }
    void dfs(List<List<Integer>> rooms,boolean [] visited,int room){
        visited[room]=true;
        for(int key:rooms.get(room)){
            if(!visited[key]){
                dfs(rooms,visited,key);
            }
        }

    }
}