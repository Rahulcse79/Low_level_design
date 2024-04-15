package Structural_design_patterns.Proxcy_pattern.Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // Create a remote proxcy.
        RemoteProxcy remoteProxcy = new RemoteProxcy();
        
        while(true){
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();
            
            switch(action)
            {
                case "left": remoteProxcy.turnLeft();
                    break;
                case "right": remoteProxcy.turnRight();
                    break;
                case "straight": remoteProxcy.gostraight();
                    break;
                default:
                    System.out.println("Invalid action");
            }
        }
    }
}
