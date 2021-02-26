package processbuilder;

import java.io.*;

public class ProcessBuilderExample
{
  public static void main(String[] args)
  {
    ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "neo4j-admin import --database=customer5 --nodes C:/PB/neo4j-enterprise-4.1.5/import/customer-load-touse.csv");

    //ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "ping -n 3 google.com");

    //ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "dir");
    //processBuilder.directory("C:\\PB\\neo4j-enterprise-4.1.5\\bin");

    processBuilder.directory(new File ("C:\\PB\\neo4j-enterprise-4.1.5\\bin"));
    try {
    Process process = processBuilder.start();

    /*process = processBuilder.start();
    processBuilder.command("cmd.exe", "/c", "neo4j console");
    process = processBuilder.start();
*/
      // Run this on Windows, cmd, /c = terminate after this run
    //processBuilder.command("neo4j-admin", "", " import --database=customer1 --nodes C:/PB/neo4j-enterprise-4.1.5/import/customer-load-touse.csv");



      System.out.println("Echo Output:\n" + output(process.getInputStream()));

    // blocked :(


    } catch (IOException e) {
      e.printStackTrace();
    } /*catch (InterruptedException e) {
      e.printStackTrace();
    }*/
  }
  private static String output(InputStream inputStream) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(inputStream));
      String line = null;
      while ((line = br.readLine()) != null) {
        sb.append(line + System.getProperty("line.separator"));
      }
    } finally {
      br.close();
    }
    return sb.toString();
  }
}
