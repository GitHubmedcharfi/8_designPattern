package tn.decorator.concrete;

import tn.decorator.component.FileStorage;

public class BasicFileStorage implements FileStorage {

	private final String storagePath;

	public BasicFileStorage(String storagePath) {
		this.storagePath = storagePath;
	}

	@Override
	public void save(String file) {
		System.out.println("Saving " + file + " to " + storagePath);
	}
}