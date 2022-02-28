package sample.persistence;

import sample.domain.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author cvoinea
 * <p>
 * Repositories define an elegant method for storing, updating, and extracting the data stored from JAVA applications.
 * Usually they have a 1-to-1 relation with the entities. Any entity that should be persisted should have a repository
 */
public class EmployeeRepository implements GenericRepository<Employee> {

    private final Map<String, Employee> storage = new HashMap<>();

    @Override
    public Employee save(Employee entity) {
        storage.put(entity.getCnp(), entity);
        return entity;
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Employee> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public void update(Employee entity) {
        storage.put(entity.getCnp(), entity);
    }

    @Override
    public void delete(Employee entity) {
        storage.remove(entity.getCnp());
    }
}
