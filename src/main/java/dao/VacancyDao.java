package dao;

import model.Vacancy;

import java.util.List;

public interface VacancyDao {
    void saveVacancy(Vacancy vacancy);
    Vacancy getById(int id);
    List<Vacancy> getAllVacancies();
    void delete(int id);
    void update(Vacancy vacancy);
}
