package persistence;

import model.Client;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryClient {
    private EntityManager em;

    public RepositoryClient() {
        em = DBUtil.getEntityManager();
    }

    public List<Client> listAllClientWithRequest(){
        return null;
    }
}
