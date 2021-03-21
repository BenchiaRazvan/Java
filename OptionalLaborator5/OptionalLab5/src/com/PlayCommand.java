package com;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class PlayCommand implements Serializable {
    PlayCommand(Document doc1) throws IOException {
        Desktop.getDesktop().open(new File(doc1.getPath()));
    }
}
