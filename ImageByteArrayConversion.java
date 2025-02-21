import java.io.*;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String sourceImage = "source.jpg";  // Change to your image file path
        String outputImage = "copy.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(sourceImage);

            // Write byte array back to image
            writeByteArrayToImage(imageBytes, outputImage);

            // Verify integrity by comparing file sizes
            verifyFileIntegrity(sourceImage, outputImage);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Convert image to byte array
    private static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];  // Read in chunks
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image converted to byte array successfully!");
            return baos.toByteArray();
        }
    }

    // Write byte array back to image file
    private static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Byte array written back to image successfully!");
        }
    }

    // Verify if both files are identical
    private static void verifyFileIntegrity(String originalPath, String copiedPath) throws IOException {
        File original = new File(originalPath);
        File copied = new File(copiedPath);

        if (original.length() == copied.length()) {
            System.out.println("✅ File verification successful: The copied image is identical to the original.");
        } else {
            System.out.println("⚠ File verification failed: The copied image is different.");
        }
    }
}
