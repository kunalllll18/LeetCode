class Solution {
    public int islandPerimeter(int[][] g) {
        int peri = 0;
        for(int r = 0; r < g.length; r++)
        {
            for(int c = 0; c < g[0].length; c++)
            {
                if(g[r][c] == 1)
                {
                    peri += 4;

                    if(c + 1 < g[0].length && g[r][c+1] == 1)
                    {
                        peri -= 2;
                    }
                    if(r + 1 < g.length && g[r+1][c] == 1)
                    {
                        peri -=2;
                    }
                }
            }
        }
        return peri;
    }
}