package tn.decorator.decorator;

import tn.decorator.component.FileStorage;

public abstract class FileStorageDecorator implements FileStorage {

	protected final FileStorage storage;

	public FileStorageDecorator(FileStorage storage) {
		this.storage = storage;
	}

	@Override
	public void save(String file) {
		storage.save(file);
	}
}