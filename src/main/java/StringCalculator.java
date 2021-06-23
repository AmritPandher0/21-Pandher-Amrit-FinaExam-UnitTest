public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                if(Integer.parseInt(number.trim()) < 0)
                    throw new IllegalArgumentException();
                if(Integer.parseInt(number.trim()) < 1000)
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}
