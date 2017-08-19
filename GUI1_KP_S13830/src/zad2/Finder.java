/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {

	private StringBuffer sb;
	private InputStream inputFile;

	public Finder(String sciezkaPliku) {
        sb = new StringBuffer("");
        try {
        	File file = new File(sciezkaPliku);
            inputFile = new FileInputStream(file);
            int k;
            while ((k = inputFile.read()) != -1) {
                this.sb.append((char) k);
            }
        } catch (Exception e) {
            System.out.println("blad odczytu pliku");
        }
    }


    public int getIfCount() {

        String pattern = "(^[^/*]|[^/*]\\s)if\\(";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sb);
        int x = 0;
        while (m.find()) {
            System.out.println("Wyrazy: "+ m.group()+"\n"+m.start());
            x++;
        }


        return x;
    }

    public int getStringCount(String s1) {

        String pattern = s1;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sb);
        int x = 0;
while (m.find()) {
	x++;
}
return x;
}
}
        