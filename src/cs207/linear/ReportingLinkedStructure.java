package cs207.linear;

import java.io.PrintWriter;
import java.util.Iterator;

public class ReportingLinkedStructure<T> extends ReportingLinearStructure<T>{
  public ReportingLinkedStructure(LinearStructure<T> ls, PrintWriter pen, String prefix){
    super(ls, pen, prefix);
  }

  public ReportingLinkedStructure(LinearStructure<T> ls, String prefix) {
    this(ls, new PrintWriter(System.err, true), prefix);
  } // ReportingLinearStructure(LinearStructure<T>)

  /**
   * Build a new experiment that uses ls to do the real work and prints 
   * comments to stdout using no prefix.
   */
  public ReportingLinkedStructure(LinearStructure<T> ls) {
    this(ls, new PrintWriter(System.err, true), "");
  } // ReportingLinearStructure(LinearStructure<T>)

}
