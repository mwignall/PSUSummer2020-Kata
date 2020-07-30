package edu.pdx.cs410J.mwignall;

public class Board {
  int[][] mines;
  
  public Board(int x, int y){
    mines = new int[x][y];
    for(int[] i : mines){
      for(int j : i){
        j = 0;
      }
    }
  }
  
  
}
