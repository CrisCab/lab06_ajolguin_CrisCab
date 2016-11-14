package edu.ucsb.cs56.pconrad.parsing.syntax;

public abstract class StringOperatorScaffold implements Operator {
    // begin instance variables
    protected final String repr;
    // end instance variables

    public StringOperatorScaffold(String repr) {
	this.repr = repr;
    }

    public String getRepr() { return repr; }

    public boolean equals(Object other) {
	return (other instanceof StringOperatorScaffold &&
		((StringOperatorScaffold)other).getRepr() == repr);
    }

    public int hashCode() {
	int result = Integer.parseInt(repr);
	return result;
    }
}
