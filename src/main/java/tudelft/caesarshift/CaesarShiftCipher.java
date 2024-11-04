package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);

            if (currentChar == ' ') {
                sb.append(currentChar);
            } else if (currentChar > 'z' || currentChar < 'a') {
                return "invalid";
            } else {
                currentChar = (char) (currentChar + shift);

                if ((char) (currentChar) > 'z') {
                    currentChar = (char) (currentChar - 26);
                } else if ((char) (currentChar) < 'a') {
                    currentChar = (char) (currentChar + 26);
                }

                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
