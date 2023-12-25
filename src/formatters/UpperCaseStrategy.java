package formatters;

public class UpperCaseStrategy implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        System.out.println("Converting to upper case");
        return text.toUpperCase();
    }
}
