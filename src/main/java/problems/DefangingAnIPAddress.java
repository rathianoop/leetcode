package problems;

public class DefangingAnIPAddress
{
  public static void main(String[] args)
  {
    System.out.println(getIPAddress("255.100.50.0"));
  }

  private static String getIPAddress(String address)
  {
    StringBuffer returningStringBuffer = new StringBuffer();
    return address.replace(".", "[.]");
  }
}
