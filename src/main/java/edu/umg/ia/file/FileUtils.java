package edu.umg.ia.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    public static String getStringFromInputStream(InputStream is) throws Exception {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }

    public static String loadResourceFile(String fileName) throws Exception{
        try {
            ClassLoader classLoader = FileUtils.class.getClassLoader();
            return getStringFromInputStream(classLoader.getResourceAsStream(fileName));
        } catch (Exception ex) {
            throw ex;
        }
    }
}
