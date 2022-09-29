package com.bl.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearchMethods operation = new BinarySearchMethods();
		System.out.println("Welcome to the Binary search Program!");

		operation.getInputList();
		operation.removeDuplicates();
		operation.sortWordList();
		String searchWord = operation.getSearchWord();
		operation.displyResult(searchWord);
		operation.printParagraph();
		operation.printWordList();

	}
}
