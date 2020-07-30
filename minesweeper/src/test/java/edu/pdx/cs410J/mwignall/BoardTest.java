package edu.pdx.cs410J.mwignall;

import junit.framework.TestCase;
import org.junit.Test;

public class BoardTest extends TestCase {
  
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
    assertEquals(0, sum);
    assertEquals(100, count);
  }
}