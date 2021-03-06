import java.util.*;

//https://www.hackerrank.com/challenges/electronics-shop

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    	
        int sum = 0;
    	
    	for(int i=0;i<keyboards.length;i++) {
    		for(int j=0;j<drives.length;j++) {
    			if((keyboards[i] + drives[j]) > sum && (keyboards[i] + drives[j]) <= b) sum = keyboards[i] + drives[j];
    		}
    	}
    	if(sum == 0) return -1;
    	
    	else return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        

        String[] bnm = scanner.nextLine().split(" ");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        System.out.println(getMoneySpent(keyboards,drives,b));
    }
}
