package PruebaConsola;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		System.out.println("Escribe la ruta del fichero o directorio.");
		Scanner sc = new Scanner(System.in);
		String Input = sc.nextLine();
		String sArg = "";
		File[] aFiles = null;
		String[] paths = null;

		File f = new File(Input);
		if (f.exists() && f.isDirectory()) {
			paths = f.list();
			for (String path : paths) {
				System.out.println(path);
			}
		} else if (f.exists() && f.isFile()) {
			Scanner sReader = new Scanner(f);
			while (sReader.hasNextLine()) {
				String temp = sReader.nextLine();
				System.out.println(temp);
			}
		} else {
			System.out.println("error");
		}

	}
}
