package main;

public class NegativeNumException {
    public static class NegativesNotAllowed extends RuntimeException {
        public NegativesNotAllowed(String neg) {
            super(neg);
        }
    }

    public static void throwExceptionIfNegativeExists(String negative_num_str) {
        if (negative_num_str != "") {
            throw new NegativesNotAllowed("Negatives Not Allowed. Numbers are: " + negative_num_str);
        }
    }

}
