import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    
    // Exercise 2: Simple Lines
    // Create a block to use
    TextBlock block = new TextLine("This is a test.");
    // Print out the block
    TBUtils.print(pen, block);

    // Exercise 3: Boxed Text
    // (a) Boxed line
    TextBlock boxed = new TextLine("Hello|");
    pen.println("+" + TBUtils.dashes(5) + "+");
    pen.print("|");
    TBUtils.print(pen, boxed);
    pen.println("+" + TBUtils.dashes(5) + "+");

    // (b) Boxed boxed line
    TextBlock boxedBoxed = new TextLine("Hello||");
    pen.println("+" + TBUtils.dashes(7) + "+");
    pen.println("|+" + TBUtils.dashes(5) + "+|");
    pen.print("||");
    TBUtils.print(pen, boxedBoxed);
    pen.println("|+" + TBUtils.dashes(5) + "+|");
    pen.println("+" + TBUtils.dashes(7) + "+");
    // (c) Boxed empty line
    TextBlock empty = new TextLine("|");
    pen.println("+" + TBUtils.dashes(1) + "+");
    pen.print("| ");
    TBUtils.print(pen, empty);
    pen.println("+" + TBUtils.dashes(1) + "+");


    // Exercise 4: Composing Text
    TextBlock hello = new TextLine("Hello");
    TextBlock goodbye = new TextLine("Goodbye");
    // (a)
    BoxedBlock vertComp = new BoxedBlock (new VComposition(hello, goodbye));
    TBUtils.print(pen, vertComp);
    // (b)
    VComposition vertComp2 = new VComposition(new BoxedBlock(hello), new BoxedBlock(goodbye));
    TBUtils.print(pen, vertComp2);
    // (c)
    HComposition horComp = new HComposition(new BoxedBlock(hello), goodbye);
    TBUtils.print(pen, horComp);
    // (d)
    HComposition horComp2 = new HComposition(goodbye, new BoxedBlock(hello));
    TBUtils.print(pen, horComp2);


    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
