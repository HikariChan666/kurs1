package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {
    void saveEmployee(Employee employee);
    Employee getById(int id);
    List<Employee> getEmployees();
    void delete(int id);
    void update(Employee employee);
}
