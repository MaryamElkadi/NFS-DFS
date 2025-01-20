import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("F:\\MaryamWork\\University\\4th term2\\Theory of compution\\Assignmenta\\Assignment2 .1\\input.txt"));
            PrintStream out = new PrintStream(new File("output.txt"));

            int problemNumber = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue; 
                }
                int caseNumber = Integer.parseInt(line.trim());
                if (caseNumber == 0) {
                    break;
                }

                out.println("Problem " + problemNumber++);

                StringBuilder input = new StringBuilder();
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    if (line.equals("end")) {
                        break;
                    }
                    input.append(line).append("\n");
                }

                String[] strings = input.toString().trim().split("\n");
                switch (caseNumber) {
                    case 1:
                        Problem1(strings, out);
                        break;
                    case 2:
                        Problem2(strings, out);
                        break;
                    case 3:
                        Problem3(strings, out);
                        break;
                    case 4:
                        Problem4(strings, out);
                        break;
                    case 5:
                        Problem5(strings, out);
                        break;
                    case 6:
                        Problem6(strings, out);
                        break;
                    case 7:
                        Problem7(strings, out);
                        //out.println(Problem7(strings, out));
                        break;
                    case 8:
                        Problem8(strings, out);
                        break;
                    case 9:
                        Problem9(strings, out);
                        break;
                    case 10:
                        Problem10(strings, out);
                        break;
                    default:
                        out.println("Invalid problem number.");
                }

                out.println("x");
            }

            scanner.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void Problem1(String[] strings, PrintStream out) {
        for (String str : strings) {
            if (!str.contains("ba")) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }

    private static void Problem2(String[] strings, PrintStream out) {
        for (String str : strings) {
            if (str.matches("^(00)*1$")) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }

    private static void Problem3(String[] strings, PrintStream out) {
        for (String str : strings) {
            if (str.replaceAll("[^x]", "").length() % 2 != 0) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }

    private static void Problem4(String[] strings, PrintStream out) {
        for (String str : strings) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }

    private static void Problem5(String[] strings, PrintStream out) {
        for (String str : strings) {
            int num = Integer.parseInt(str);
            if (num % 4 == 0) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }
    private static void Problem6(String[] strings, PrintStream out) {
        for (String str : strings) {
            if (!str.contains("11") && !str.contains("111")) {
                out.println("True");
            } else {
                out.println("False");
            }
        }
    }
    private static void Problem7(String[] strings, PrintStream out) {
        for (String s : strings) {
            int count01 = 0;
            int count10 = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.substring(i, i + 2).equals("01")) {
                    count01++;
                } else if (s.substring(i, i + 2).equals("10")) {
                    count10++;
                }
            }
            out.println(count01 == count10 ? "True" : "False");
        }
        
    }
    private static void Problem8(String[] strings, PrintStream out) {
        for (String str : strings) {
            out.println(str.contains("101") || str.contains("010"));
        }
    }

    private static void Problem9(String[] strings, PrintStream out) {
        for (String str : strings) {
            boolean consecutive = false;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    consecutive = true;
                    break;
                }
            }
            out.println(!consecutive);
        }
    }
    private static void Problem10(String[] strings, PrintStream out) {
        for (String str : strings) {
            boolean ok = true;
            if (str.endsWith("0")) {
                ok = false;
                out.println(ok);
                break;
            }
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == '0') {
                    if (str.charAt(i + 1) != '1') {
                        ok = false;
                        break;
                    }
                }
            }
            out.println(ok);
        }
    }
    


    
}
