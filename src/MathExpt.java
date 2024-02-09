import java.io.PrintWriter;

/**
 * A few simple experiments with our utilities.
 *
 * @author Samuel A. Rebelsky
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    // Exercise 1: Square roots
    // (c) Print more sqrts
    // Integer
    double rootInt = MathUtils.squareRoot(4);
    pen.println("The square root of " + 4 + " seems to be " + rootInt);
    pen.println(rootInt + "^2 = " + (rootInt * rootInt));

    // Float
    double rootFloat = MathUtils.squareRoot((float) 4.0);
    pen.println("The square root of " + 4.0 + " seems to be " + rootFloat);
    pen.println(rootFloat + "^2 = " + (rootFloat * rootFloat));

    // Double
    double rootDouble = MathUtils.squareRoot((Double) 2.25);
    pen.println("The square root of " + 2.25 + " seems to be " + rootDouble);
    pen.println(rootDouble + "^2 = " + (rootDouble * rootDouble));

    // BigInteger
    double rootBigInt = MathUtils.squareRoot(java.math.BigInteger.valueOf(16));
    pen.println("The square root of " + 16 + " seems to be " + rootBigInt);
    pen.println(rootBigInt + "^2 = " + (rootBigInt * rootBigInt));

    // BigDecimal
    double rootBigD = MathUtils.squareRoot(java.math.BigDecimal.valueOf(2.25));
    pen.println("The square root of " + 2.25 + " seems to be " + rootBigD);
    pen.println(rootBigD + "^2 = " + (rootBigD * rootBigD));

    // double
    double rootLittleDoub = MathUtils.squareRoot((double) 2.25);
    pen.println("The square root of " + 2.25 + " seems to be " + rootLittleDoub);
    pen.println(rootLittleDoub + "^2 = " + (rootLittleDoub * rootLittleDoub));

    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
