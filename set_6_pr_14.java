class AverageCalculator {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }
            double num = Double.parseDouble(values[i]);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {
        String[] validData = {"10", "20", "30"};
        String[] invalidData = {"10", "abc", "30"};
        String[] nullData = {"10", null, "30"};
        try {
            double result = average(validData);
            System.out.println("Average (Valid Data): " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished validData test\n");
        }
        try {
            double result = average(invalidData);
            System.out.println("Average (Invalid Data): " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished invalidData test\n");
        }
        try {
            double result = average(nullData);
            System.out.println("Average (Null Data): " + result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Null value found");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished nullData test\n");
        }
    }
}
/*
  output:
Average (Valid Data): 20.0
Finished validData test

NumberFormatException: Invalid number format
Finished invalidData test

NullPointerException: Null value found
Finished nullData test
  */
