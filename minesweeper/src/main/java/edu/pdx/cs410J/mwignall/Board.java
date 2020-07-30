package edu.pdx.cs410J.mwignall;

public class Board {
  int[][] mines;
  
  public Board(int x, int y){

    if(x > 100 || y > 100)
      throw new IllegalArgumentException("Dimensions of the board should be <= 100 for each dimenesion");

    if(x <= 0 || y <= 0)
      throw new IllegalArgumentException("Dimensions of the board should be <= 100 for each dimenesion");

    mines = new int[x][y];
    for(int[] i : mines){
      for(int j : i){
        j = 0;
      }
    }


  }
  
  
}
