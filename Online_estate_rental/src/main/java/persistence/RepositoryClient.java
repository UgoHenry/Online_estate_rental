package persistence;

import model.Client;
import model.ClientCustomised;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryClient {
    private EntityManager em;

    public RepositoryClient() {
        em = DBUtil.getEntityManager();
    }

    public List<Client> listAllClientWithRequest(){
        String sql = "SELECT c.clientId, c.name, c.phoneNumber, c.clientRequest " +
                "FROM Client c ORDER BY c.clientRequest";

        return em.createQuery(sql).getResultList();
    }

    public List<Client> listClientOnlineFilterByRoleId(int roleId){
        String sql = "SELECT c.name, c.phoneNumber FROM Client c ORDER BY roleId";
        return em.createQuery(sql).getResultList();
    }

    public List<ClientCustomised> listClientFilterByPortalSearch(){
        String sql = "SELECT new model.ClientCustomised" +
                "(c.clientId, c.name, c.phoneNumber, c.onlinePortalId, c.enterSearch) " +
                "FROM Client c ORDER BY c.enterSearch";
        return em.createQuery(sql).getResultList();
    }

}
