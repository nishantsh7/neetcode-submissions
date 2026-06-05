class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<Character> set = new HashSet<>();
      int count=0;
      for(int i=0;i<9;i++)
      {
        for(int j=0;j<9;j++)
        {
        if(board[i][j]!='.'){
        set.add(board[i][j]);
        count++;
      }}
      if(set.size()!=count)
      return false;
      count=0;
      set.clear();
      }
    set.clear();
    count=0;
    for(int i =0;i<9;i++)
    {
      for(int j=0;j<9;j++)
      {
        if(board[j][i]!= '.'){
        set.add(board[j][i]);
        count++;
        }
      }
      if(set.size()!=count)
      return false;
      count=0;
      set.clear();
    }
    set.clear();
    count=0;
    for(int i=0;i<9;i=i+3)
{
  for(int k=0;k<9;k=k+3)
  {
  for(int j=0;j<3;j++)
  {
    for(int x=0;x<3;x++){
    if(board[i+x][k+j]!='.')
    {set.add(board[i+x][k+j]);
        count++;
      }}
  }
  if(set.size()!=count)
      return false;
      count=0;
      set.clear();
  }}
  return true;
}}
