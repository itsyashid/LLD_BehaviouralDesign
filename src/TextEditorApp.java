import actors.TextEditor;
import commands.FormatTextCommand;
import commands.TextEditorCommand;
import formatters.TextFormattingStrategy;
import formatters.UpperCaseStrategy;
import observers.TextConsoleObserver;
import observers.TextEditorObserver;

public class TextEditorApp {
    public static void main(String[] args){

        // need to create the Text Editor
        TextEditor textEditor=new TextEditor();
        // Text Editor Observers
        TextEditorObserver observer=new TextConsoleObserver();
        // Register all the observer with the text editor
        textEditor.registerObserver(observer);
        textEditor.setCurrentText("Observer Notified");
        // Formatters
        TextFormattingStrategy upperCaseStrategy=new UpperCaseStrategy();
        // Command to create the text
        TextEditorCommand command=new FormatTextCommand(upperCaseStrategy,textEditor,"Observer Notified");
        command.execute();

        textEditor.notifyObserver();
    }
}
