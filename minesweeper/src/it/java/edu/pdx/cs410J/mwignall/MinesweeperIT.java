package edu.pdx.cs410J.mwignall;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class MinesweeperIT extends InvokeMainTestCase {

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf0() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class);
    assertThat(result.getExitCode(), equalTo(0));
  }

  @Test
  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Minesweeper.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
