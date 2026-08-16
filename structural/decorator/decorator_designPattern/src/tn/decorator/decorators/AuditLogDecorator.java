package tn.decorator.decorators;

import tn.decorator.component.FileStorage;
import tn.decorator.decorator.FileStorageDecorator;

public class AuditLogDecorator extends FileStorageDecorator {

	private final String loggerName;

	public AuditLogDecorator(FileStorage storage, String loggerName) {

		super(storage);
		this.loggerName = loggerName;
	}

	@Override
	public void save(String file) {

		System.out.println("[" + loggerName + "] " + "Saving file: " + file);

		storage.save(file);
	}
}