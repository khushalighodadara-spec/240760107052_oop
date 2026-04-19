import java.io.*;
public class FileOperations {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("copy source destination");
            System.out.println("delete filename");
            System.out.println("rename oldname newname");
            return;
        }

        String command = args[0];

        try {
            // COPY
            if (command.equalsIgnoreCase("copy")) {

                File src = new File(args[1]);
                File dest = new File(args[2]);

                FileInputStream fis = new FileInputStream(src);
                FileOutputStream fos = new FileOutputStream(dest);

                int ch;
                while ((ch = fis.read()) != -1) {
                    fos.write(ch);
                }

                fis.close();
                fos.close();

                System.out.println("File copied successfully.");

                // File Properties
                System.out.println("\n--- File Properties ---");
                System.out.println("File Name: " + dest.getName());
                System.out.println("Absolute Path: " + dest.getAbsolutePath());
                System.out.println("File Size: " + dest.length() + " bytes");
                System.out.println("Readable: " + dest.canRead());
                System.out.println("Writable: " + dest.canWrite());
                System.out.println("Last Modified: " + dest.lastModified());
            }

            // DELETE
            else if (command.equalsIgnoreCase("delete")) {

                File file = new File(args[1]);

                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Delete failed.");
                }
            }

            // RENAME
            else if (command.equalsIgnoreCase("rename")) {

                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully.");

                    // File Properties
                    System.out.println("\n--- File Properties ---");
                    System.out.println("File Name: " + newFile.getName());
                    System.out.println("Absolute Path: " + newFile.getAbsolutePath());
                    System.out.println("File Size: " + newFile.length() + " bytes");
                    System.out.println("Readable: " + newFile.canRead());
                    System.out.println("Writable: " + newFile.canWrite());
                    System.out.println("Last Modified: " + newFile.lastModified());
                } else {
                    System.out.println("Rename failed.");
                }
            }

            else {
                System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("IO Error occurred.");
        }
    }
}
/*output 1.
  File copied successfully.

--- File Properties ---
File Name: b.txt
Absolute Path: C:\Users\YourName\b.txt
File Size: 120 bytes
Readable: true
Writable: true
Last Modified: 1713500000000
  output 2:
File renamed successfully.

--- File Properties ---
File Name: newfile.txt
Absolute Path: C:\Users\YourName\newfile.txt
File Size: 120 bytes
Readable: true
Writable: true
Last Modified: 1713500000000
  output 3:
File deleted successfully.
  output 4:
Error: File not found.
  */
