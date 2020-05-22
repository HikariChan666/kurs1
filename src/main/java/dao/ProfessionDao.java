package dao;

import model.Profession;

import java.util.List;

public interface ProfessionDao {
    void saveProfession(Profession profession);
    Profession getById(int id);
    List<Profession> getAllProfessions();
    void delete(int id);
    void update(Profession profession);
}
