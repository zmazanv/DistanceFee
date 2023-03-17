public class DistanceFee {

  public static int distanceFee(int miles) {
    int feeInUSD = 0;
    if (miles >= 0 && miles <= 4) {
      feeInUSD = 2;
    } else if (miles >= 5 && miles <= 15) {
      feeInUSD = 5;
    } else if (miles >= 16 && miles <= 25) {
      feeInUSD = 10;
    } else if (miles >= 26 && miles <= 50) {
      feeInUSD = 15;
    } else if (miles > 50) {
      feeInUSD = 20;
    }
    return feeInUSD;
  }

  public static void main(String[] args) {
    System.out.println(distanceFee(0));
    System.out.println(distanceFee(2));
    System.out.println(distanceFee(4));
    System.out.println(distanceFee(6));
    System.out.println(distanceFee(20));
    System.out.println(distanceFee(37));
    System.out.println(distanceFee(50));
    System.out.println(distanceFee(51));
  }
}
