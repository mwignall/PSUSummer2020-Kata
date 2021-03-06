package edu.pdx.cs410J.mwignall;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BoardTest {
  
  @Test
  public void testConstruct(){
    Board newBoard = new Board(10, 10);
    int sum = 0;
    int count = 0;
    for (int[] i : newBoard.mines){
      for(int j : i){
        sum += j;
        count += 1;
      }
    }
    Assert.assertEquals(0, sum);
    Assert.assertEquals(100, count);
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidBoardSizeOnCreationFails () {
    Board newBoard = new Board(200, 200);
  }

  @Test(expected = IllegalArgumentException.class)
  public void boardSizeWithNegativeOrZeroNumbers () {
    Board newBoard = new Board(0, -1);
  }

  @Test
  public void addMineAt5(){
    Board newBoard = new Board(10,10);
    int sum = 0;
    int count = 0;
    for (int[] i : newBoard.mines){
      for(int j : i){
        sum += j;
        count += 1;
      }
    }
    Assert.assertEquals(1, sum);
    Assert.assertEquals(100, count);
  }






}