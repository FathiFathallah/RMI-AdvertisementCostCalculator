import java.util.Scanner;
import java.util.InputMismatchException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Client{
    public static void main(String args[]){
        boolean connected = false;
        ADService stub1 = null, stub2 = null;
        Scanner input = new Scanner(System.in);
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);  
            stub1 = (ADService) registry.lookup("Server1");
            stub2 = (ADService) registry.lookup("Server2");
            connected = true;
        } catch (Exception e){
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
        while(connected){
            System.out.println("Enter The Number Of Days to computer, than that to exit:");
            try{
                int days = input.nextInt();
                if(days <= 10){
                    System.out.println("Cost = "+stub1.computeADCost(days));
                }else{
                    System.out.println("Cost = "+stub2.computeADCost(days));
                }
            } catch (InputMismatchException e){
                break;
            } catch (Exception e){
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
            }   
        }
    }
}