package method;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteConnection extends UnicastRemoteObject implements rmi.Method {

    public RemoteConnection() throws RemoteException {
    }

    @Override
    public boolean checkName(String userName) throws RemoteException {
        for (Client client : Connection.getClients()) {
            String name = client.getUserName();
            if (name.equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }

}
