import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ADService extends Remote{
    public double computeADCost(int days) throws RemoteException;
} 