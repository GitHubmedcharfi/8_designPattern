package tn.decorator;

import tn.decorator.component.FileStorage;
import tn.decorator.concrete.BasicFileStorage;
import tn.decorator.decorators.AuditLogDecorator;
import tn.decorator.decorators.CompressionDecorator;
import tn.decorator.decorators.EncryptionDecorator;

public class Main {

    public static void main(String[] args) {

        FileStorage storage = new AuditLogDecorator(
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new BasicFileStorage("/storage"),
                                "SECRET-KEY"
                        ),
                        5
                ),
                "FileAuditLogger"
        );

        storage.save("C:\\Users\\MSI\\Downloads\\svt3t1.pdf");
    }
}