import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes()); // Write bytes to stream
            System.out.println("Writer: Data written successfully.");
            pos.close(); // Close stream after writing
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer); // Read bytes from stream
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader: Received - " + receivedMessage);
            pis.close(); // Close stream after reading
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect streams

            // Create and start threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);
            
            writer.start();
            reader.start();

            writer.join(); // Ensure writer finishes before reader
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Main Thread Error: " + e.getMessage());
        }
    }
}
