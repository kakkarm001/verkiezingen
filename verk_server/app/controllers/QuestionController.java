package controllers;

import models.Question;
import dao.IQuestionDao;
import dao.QuestionJpaDao;
import org.hibernate.Criteria;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import services.EntityManagerUtility;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

import static play.libs.Json.toJson;

public class QuestionController extends Controller {

    private final FormFactory formFactory;
    private final JPAApi jpaApi;
    private static IQuestionDao questionDao = new QuestionJpaDao();
    

    @Inject
    public QuestionController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    public Result index() {
        return ok("ok");//views.html.index.render()
    }

    
    @Transactional(readOnly = true)
    public Result getQuestions() {
        List<Question> questions = questionDao.findAll();
        String questionss = questions.toString();
        return ok(questionss);
    }
    
}