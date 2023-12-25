package actors;

import observers.TextEditorObserver;

public interface TextEditorSubject {
    // Register the observer
    void registerObserver(TextEditorObserver observer);

    // remove the observer
    void removeObserver(TextEditorObserver observer);

    // Notify the observer
    void notifyObserver();
}
