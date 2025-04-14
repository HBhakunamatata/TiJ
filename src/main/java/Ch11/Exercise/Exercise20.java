package Ch11.Exercise;

/*
 Modify StormyInning.java by adding an UmpireArgument exception type
 and methods that throw this exception. Test the modified hierarchy.
 */

// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class UmpireArgument extends BaseballException {}
class ThrownFromGame extends UmpireArgument {}

abstract class Inning2 {
	public Inning2() throws BaseballException {}
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul, UmpireArgument;
	public void questionableCall() throws UmpireArgument {}
	public void walk() {} // Throws no checked exceptions
}


public class Exercise20 extends Inning2 implements Storm {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public Exercise20()
		throws UmpireArgument, RainedOut, BaseballException {}
	public Exercise20(String s)
		throws Foul, BaseballException {}
	// Regular methods must comform to base class:
	//! void walk() throws PopFoul {} // Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
	//! public void event() throws RainedOut {}
	// If method doesn't already exist in the
	// base class, the exception is OK:
	public void rainHard() throws RainedOut {}
	// You can choose to not throw any exceptions,
	// even if the base class version does:
	public void event() {}
	// Overridden methods can throw inherited exceptions:
	public void atBat() throws PopFoul, ThrownFromGame {
		throw new ThrownFromGame();
	}
	public void questionableCall() throws UmpireArgument {
		throw new UmpireArgument();
	}
	public static void main(String[] args) {
		try {
			Exercise20 si = new Exercise20();
			si.atBat();
			si.questionableCall();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(UmpireArgument e) {
			System.out.println("Umpire argument (StormyInning20)");
		// } catch(ThrownFromGame e) {
		//	System.out.println("Thrown from game");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning2 i = new Exercise20();
			i.atBat();
			// You must catch the exceptions from
			// the base-class version of the method:
		} catch(Strike e) {
			System.out.println("Strike");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(ThrownFromGame e) {
			System.out.println("Thrown from game (Inning)");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}
