package gljw.annotations;

/**
 *This annotation signs the code that can crash the Java virtual machine in certain situations.
 * */
public @interface Unstable {
	String value();
}
