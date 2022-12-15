package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    //construct a for loop to traverse through the array
    //check each element and increment the respective variable
    // considering all the elements in the array is >0
    for (int i=0;i<cycles.length;i++) {
    if(cycles[i]<310)
    {
    	counts.lowCount++;	
    }
    else if(cycles[i]>=930)
    {
    	counts.highCount++;
    }
    else {
    	counts.mediumCount++;
    }}
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    try
    {
    //test case 1
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    //test case 2 with boundary conditions
    CountsByUsage counts1 = countBatteriesByUsage(new int[] {100, 310, 500, 600, 930, 1000});
    assert(counts1.lowCount == 1);
    assert(counts1.mediumCount == 3);
    assert(counts1.highCount == 2);
    //System.out.println(counts1.lowCount);

    System.out.println("Done counting :)\n");
    }
    // if any assert function fails an error message is displayed
    catch(AssertionError e) {
        System.out.println("Test case failed\nError in counting :)\n");
    }
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
    

  }
}
