package connections;

import java.io.*;

public class Imports {
    private File file;

    public Imports(String file)
    {
        this.file = new File(file);
    }

    public StringBuilder getFile()
    {
        StringBuilder string = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(this.file));

            String  inputLine;
            while ((inputLine = in.readLine()) != null ) {
                string.append(inputLine);
                string.append("\n");
            }

            in.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return string;
    }
}
