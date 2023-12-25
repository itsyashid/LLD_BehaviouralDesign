package observers;

public class TextConsoleObserver implements  TextEditorObserver{
    @Override
    public void update(String text) {
        System.out.println("Text updated in console: "+ text);
    }
}
