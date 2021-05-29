package persistence;

import model.Agent;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryAgent {
    private EntityManager em;

    public RepositoryAgent() {
        em = DBUtil.getEntityManager();
    }

    public List<Agent> listAvailableAgent(){

        return null;
    }
}
