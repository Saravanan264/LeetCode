class Solution {
        public void backtrack(int[][]image,int row,int col,int orgc,int nc){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length ||image[row][col]!=orgc){
            return;
        }
        image[row][col]=nc;
        backtrack(image,row+1,col,orgc,nc);
        backtrack(image,row,col+1,orgc,nc);
        backtrack(image,row-1,col,orgc,nc);
        backtrack(image,row,col-1,orgc,nc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgc=image[sr][sc];
        if(orgc==color){
            return image;
        }
        backtrack(image,sr,sc,orgc,color);
        return image;
    }
}