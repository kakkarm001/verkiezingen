package dao;

import models.Subject;

import java.util.List;

public interface ISubjectDao {
    List<Subject> findAll();
    List<Subject> findSubjectById(String id);
}