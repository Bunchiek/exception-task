package homework.exceptions;

import java.util.Optional;

public class ExceptionTask {

    public static Optional<String> mergeStrings(String first, String second) {


        if ((first == null || first.isEmpty()) && (second == null || second.isEmpty())) {
            return Optional.empty();
        }

        if (first == null) {
            first = "";
        }

        if (second == null) {
            second = "";
        }

        String merged = first + second;

        return Optional.of(first.length() > second.length() ? first + second : second + first);

    }

    public static long getPower(int n, int p) {

        if (n < 0 || p < 0) {
            return -1;
        } else if (n == 0 || p == 0) {
            return -1;
        } else {
            return (long) (Math.pow(n, p));
        }
    }

    public static void customException(int a) {
        if (a==0) {
            throw new InvalidZeroParameterException();
        }
    }

    public static void exceptionProcessing() {
        try {
            throwCheckedException();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throwUncheckedException();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void throwCheckedException() throws Exception {
        throw new Exception("Checked exception");
    }

    private static void throwUncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }
}
