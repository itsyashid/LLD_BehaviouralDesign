package commands;

import actors.TextEditor;
import formatters.TextFormattingStrategy;

public class FormatTextCommand implements TextEditorCommand{
    private TextFormattingStrategy textFormattingStrategy;
    private TextEditor textEditor;
    private String textToFormat;

    public FormatTextCommand(TextFormattingStrategy textFormattingStrategy, TextEditor textEditor, String textToFormat) {
        this.textFormattingStrategy = textFormattingStrategy;
        this.textEditor = textEditor;
        this.textToFormat = textToFormat;
    }

    @Override
    public void execute() {
        System.out.println("Formatting the text");
        String formattedText=textFormattingStrategy.format(textToFormat);
        textEditor.setCurrentText(formattedText);
    }
}
