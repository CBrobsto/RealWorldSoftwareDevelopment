package main.java.chapter4;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageImporter implements Importer {
    @Override
    public Document importFile(final File file) throws IOException {
        final Map<String, String> attributes = new HashMap<>();
        attributes.put(Attributes.PATH, file.getPath());

        final BufferedImage image = ImageIO.read(file);
        attributes.put(Attributes.WIDTH, String.valueOf(image.getWidth()));
        attributes.put(Attributes.HEIGHT, String.valueOf(image.getHeight()));
        attributes.put(Attributes.TYPE, "IMAGE");

        return new Document(attributes);
    }
}
