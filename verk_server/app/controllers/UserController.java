package controllers;

import models.User;
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
import java.util.List;

import static play.libs.Json.toJson;

public class UserController extends Controller {

    private final FormFactory formFactory;
    private final JPAApi jpaApi;

    @Inject
    public UserController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    public Result index() {
        return ok("ok");//views.html.index.render()
    }


//    @Transactional
//    public Result addUser() {
//        User user = formFactory.form(User.class).bindFromRequest().get();
//        jpaApi.em().persist(user);
//        return redirect(routes.UserController.index());
//    }

    @Transactional(readOnly = true)
    public Result getUser() {
//        EntityManager em = EntityManagerUtility.getEntityManager();
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//        CriteriaQuery<Object> criteria = builder.createQuery();
//        criteria.
//
//        List<User> users =
//
                return ok("this is static");
    }

}