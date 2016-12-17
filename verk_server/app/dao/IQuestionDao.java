package dao;

import models.Question;

import java.util.List;

public interface IQuestionDao {
    List<Question> findAll();
    List<Question> findQuestionById(String id);
}