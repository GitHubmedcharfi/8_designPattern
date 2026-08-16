package tn.decorator.decorators;

import tn.decorator.component.FileStorage;
import tn.decorator.decorator.FileStorageDecorator;

public class CompressionDecorator extends FileStorageDecorator {

	private final int compressionLevel;

	public CompressionDecorator(FileStorage storage, int compressionLevel) {

		super(storage);
		this.compressionLevel = compressionLevel;
	}

	@Override
	public void save(String file) {

		System.out.println("Compressing " + file + " with level: " + compressionLevel);

		storage.save(file);
	}
}
