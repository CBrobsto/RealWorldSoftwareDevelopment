package main.java.chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Map;
// import java.util.regex.Pattern; // Alternative to startsWith()

import static main.java.chapter4.Attributes.*;

public class LetterImporter implements Importer {
    private static final String NAME_PREFIX = "Dear ";

    @Override
    public Document importFile(final File file) throws IOException {
        final TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);

        final int lineNumber = textFile.addLines(2, line -> ((String) line).isEmpty(), ADDRESS);    // String::isEmpty
        textFile.addLines(lineNumber + 1, line -> ((String) line).startsWith("regards,"), BODY);    // (line) -> line.startsWith("regards,")
        // line -> Pattern.compile("^regards,").matcher((String) line).find()

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "LETTER");
        return new Document(attributes);
    }
}
