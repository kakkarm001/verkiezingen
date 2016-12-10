package controllers;

import models.User;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
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
        List<User> users = (List<User>) jpaApi.em().createQuery("select * from users").getResultList();
        return ok(toJson(users));
    }

}