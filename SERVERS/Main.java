import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class Main{
    public static void main(String args[]){
        try{
            Server1 server1_Object = new Server1();
            Server2 server2_Object = new Server2();
            ADService skelton1 = (ADService) UnicastRemoteObject.exportObject(server1_Object, 0);
            ADService skelton2 = (ADService) UnicastRemoteObject.exportObject(server2_Object, 0);
            Registry registry = LocateRegistry.getRegistry(1099);
            registry.bind("Server1", skelton1);
            registry.bind("Server2", skelton2);
            System.out.println("#SERVER 1,2 ARE LISTENING#");
        } 
        catch (Exception e){
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

    }
}