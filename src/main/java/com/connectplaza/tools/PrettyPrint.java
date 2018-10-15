package com.connectplaza.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrettyPrint {

	private static final Object EOL = System.getProperty("line.separator");
	private static final String SEARCH_STR = "[{()}],";

	private static String prettyPrintMessage(String message) {
		StringBuilder result = new StringBuilder();
		int indentLevel = 0;
		int nextIdx = 0;
		int startIdx = 0;
		message = message.replace("\r\n", " ").replace("\n", " ");

		while (nextIdx != -1) {
			nextIdx = indexOfFirstContainedCharacter(message, startIdx);
			if (nextIdx != -1) {
				char c = message.charAt(nextIdx);
				if (c == ',') {
					result.append(printTabs(indentLevel)).append(message.substring(startIdx, nextIdx + 1).trim()).append(EOL);
				} else if (c == '{' || c == '[' || c == '(') {
					result.append(printTabs(indentLevel)).append(message.substring(startIdx, nextIdx + 1).trim()).append(EOL);
					indentLevel++;
				} else if (c == '}' || c == ']' || c == ')') {
					result.append(printTabs(indentLevel)).append(message.substring(startIdx, nextIdx).trim()).append(EOL);
					indentLevel--;
					result.append(printTabs(indentLevel)).append(message.charAt(nextIdx)).append(EOL);
				}
				startIdx = nextIdx + 1;
			}
		}

		return result.toString();
	}

	private static int indexOfFirstContainedCharacter(String s1, int start) {
		for (int i = start; i < s1.length(); i++) {
			if (SEARCH_STR.indexOf(s1.charAt(i)) != -1) {
				return i; // Found a character in s1 also in search set.
			}
		}

		return -1; // No matches.
	}

	private static String printTabs(int level) {
		StringBuilder tabs = new StringBuilder();

		for (int i = 0; i < level; i++) {
			tabs.append("\t");
		}

		return tabs.toString();
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String input;
			StringBuilder sb = new StringBuilder();

			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			System.out.println(prettyPrintMessage(sb.toString()));

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
