package Main;

public class DecodeString {

    int index = 0;

    public String decodeString(String s) {

        StringBuilder decoded = new StringBuilder();
        while (index < s.length() && s.charAt(index) != ']') {


            if (!Character.isDigit(s.charAt(index))) decoded.append(s.charAt(index++));


            else {
                int k = 0;


                while (index < s.length() && Character.isDigit(s.charAt(index))) k = k * 10 + s.charAt(index++) - '0';


                index++;
                String answer = decodeString(s);


                index++;


                while (k-- > 0) decoded.append(answer);
            }
        }
        return new String(decoded);
    }
}
