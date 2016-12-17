package dao;

import play.mvc.Result;
import services.EntityManagerUtility;
import org.hibernate.Criteria;
import models.Question;
import play.db.jpa.JPA;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class QuestionJpaDao implements IQuestionDao {

    @Override
    public List<Question> findAll() {
        EntityManager em = EntityManagerUtility.getEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Question> criteria = builder.createQuery(Question.class);
        Root<Question> questionRoot = criteria.from( Question.class );
        criteria.select(questionRoot.get("question"));
        List<Question> questions = em.createQuery(criteria).getResultList();
        
        return questions;
    }

    @Override
    public List<Question> findQuestionById(String id) {
        EntityManager em = EntityManagerUtility.getEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Question> criteria = builder.createQuery(Question.class);
        Root<Question> questionRoot = criteria.from( Question.class );
        criteria.select(questionRoot.get("question"));
        criteria.where(builder.equal(questionRoot.get("question_id"),id));
        List<Question> question = em.createQuery(criteria).getResultList();
        
        return question;
    }


}
