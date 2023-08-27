import java.rmi.RemoteException;
public class Server1 implements ADService{
    public Server1(){
        System.out.println("#SERVER1 OBJECT CREATED##");
    }
    @Override
    public double computeADCost(int days) throws RemoteException{
        System.out.println("SERVER#1 COMPUTED");
        return (days * 10.0);
    }
}