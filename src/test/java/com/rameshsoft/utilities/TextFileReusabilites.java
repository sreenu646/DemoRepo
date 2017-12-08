package com.rameshsoft.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReusabilites {

	private String textFilePath;
	File f;
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;

	public TextFileReusabilites(String textFilePath) throws IOException {
		this.textFilePath = textFilePath;
		f = new File(textFilePath);
		fw = new FileWriter(f);
		bw = new BufferedWriter(fw);
		fr = new FileReader(f);
		br = new BufferedReader(fr);

		boolean b = f.createNewFile();
		if (b) {
			System.out.println("file is created");
		} else
			System.out.println("already existed");

	}

	public String readOneLine() throws IOException {
		String data = br.readLine();
		return data;
	}

	public List readAllLines() throws IOException {
		List l = new ArrayList();
		while (br.ready()) {

			String data = br.readLine();
			l.add(data);

		}

		return l;

	}

	public void writeLine(int a) throws IOException {
		bw.write(a);
		bw.flush();
	}

	public void writeLine(String a) throws IOException {
		bw.write(a);
		bw.flush();
	}

}
