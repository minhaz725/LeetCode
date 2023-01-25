public class RomanToInteger {
    public int romanToInt(String s) {
        String []roman = s.split("");
        int integer = 0;
        for(int i= roman.length -1; i>= 0; i-- ){
            switch (roman[i]) {
                case "I" -> integer = integer + 1;
                case "V" -> {
                    if (i > 0 && roman[i - 1].equals("I")) {
                        integer = integer + 4;
                        i--;
                        break;
                    }
                    integer = integer + 5;
                }
                case "X" -> {
                    if (i > 0 && roman[i - 1].equals("I")) {
                        integer = integer + 9;
                        i--;
                        break;
                    }
                    integer = integer + 10;
                }
                case "L" -> {
                    if (i > 0 && roman[i - 1].equals("X")) {
                        integer = integer + 40;
                        i--;
                        break;
                    }
                    integer = integer + 50;
                }
                case "C" -> {
                    if (i > 0 && roman[i - 1].equals("X")) {
                        integer = integer + 90;
                        i--;
                        break;
                    }
                    integer = integer + 100;
                }
                case "D" -> {
                    if (i > 0 && roman[i - 1].equals("C")) {
                        integer = integer + 400;
                        i--;
                        break;
                    }
                    integer = integer + 500;
                }
                case "M" -> {
                    if (i > 0 && roman[i - 1].equals("C")) {
                        integer = integer + 900;
                        i--;
                        break;
                    }
                    integer = integer + 1000;
                }
            }
        }
        return integer;
    }
}
