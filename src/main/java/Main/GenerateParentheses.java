package Main;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, n, result);
        return result;
    }

    private void generate(String current, int openLeft, int closeLeft, List<String> result) {
        if (openLeft == 0 && closeLeft == 0) {
            result.add(current);
            return;
        }

        if (openLeft > 0) {
            generate(current + "(", openLeft - 1, closeLeft, result);
        }

        if (closeLeft > openLeft) {
            generate(current + ")", openLeft, closeLeft - 1, result);
        }
    }
}
