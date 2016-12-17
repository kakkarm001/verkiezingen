package dao;

import play.mvc.Result;
import services.EntityManagerUtility;
import org.hibernate.Criteria;
import models.Subject;
import play.db.jpa.JPA;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class SubjectJpaDao implements ISubjectDao {

    @Override
    public List<Subject> findAll() {
        EntityManager em = EntityManagerUtility.getEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Subject> criteria = builder.createQuery(Subject.class);
        Root<Subject> subjectRoot = criteria.from( Subject.class );
        criteria.select(subjectRoot.get("subject_name"));
        //criteria.where(builder.equal(subjectRoot.get("subject_id"),1));
        List<Subject> subjects = em.createQuery(criteria).getResultList();
        //String subjectss = subjects.toString();
        return subjects;
    }

    @Override
    public List<Subject> findSubjectById(String id) {
        EntityManager em = EntityManagerUtility.getEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Subject> criteria = builder.createQuery(Subject.class);
        Root<Subject> subjectRoot = criteria.from( Subject.class );
        criteria.select(subjectRoot.get("subject_name"));
        criteria.where(builder.equal(subjectRoot.get("subject_id"),id));
        List<Subject> subject = em.createQuery(criteria).getResultList();
        //String subjectss = subjects.toString();
        return subject;
    }


}
