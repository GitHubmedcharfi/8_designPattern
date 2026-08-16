package tn.decorator.decorators;

import tn.decorator.component.FileStorage;
import tn.decorator.decorator.FileStorageDecorator;

public class EncryptionDecorator extends FileStorageDecorator {

	private final String encryptionKey;

	public EncryptionDecorator(FileStorage storage, String encryptionKey) {

		super(storage);
		this.encryptionKey = encryptionKey;
	}

	@Override
	public void save(String file) {

		System.out.println("Encrypting " + file + " using key: " + encryptionKey);

		storage.save(file);
	}
}