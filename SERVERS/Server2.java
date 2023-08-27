import java.rmi.RemoteException;
public class Server2 implements ADService{
    public Server2(){
        System.out.println("#SERVER2 OBJECT CREATED##");
    }
    @Override
    public double computeADCost(int days) throws RemoteException{
        System.out.println("SERVER#2 COMPUTED");
        return ((days * 10.0) - (days * 0.05));
    }
}