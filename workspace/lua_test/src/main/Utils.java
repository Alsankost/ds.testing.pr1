package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
	
	private static void exists(File file) throws FileNotFoundException {
		if (!file.exists()) {
			throw new FileNotFoundException(file.getName());
		}
	}
	
	public static String read(File file) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		
		exists(file);
		
		try {
			BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		}
		catch(IOException e) {
			throw new RuntimeException(e);
		}

	    return sb.toString();
	}
}
