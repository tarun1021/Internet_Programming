import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\ktaru\\OneDrive\\Desktop\\readme.txt"), "UTF-8"));
        String lines = br.readLine();
        ArrayList<String> buffer = new ArrayList<String>();
        int counter = 0;
        while (lines != null) {
            counter++;
            buffer.add("\n");
            if (counter % 2 == 1) {
                StringBuilder str = new StringBuilder();
                String[] splitStr = lines.split(" ");
                for (int i = splitStr.length; i > 0; i--) {
                    str.append(splitStr[i - 1]).append(" ");
                }
                buffer.add(str.toString());
            } else {
                buffer.add(lines);
            }
            lines = br.readLine();
        }
        for (int i = 0; i < buffer.size() - 1; i++) {
            System.out.print(buffer.get(i));
        }
        br.close();
		
	}

}
