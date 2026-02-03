package repo;

import model.Department;

import java.util.HashMap;
import java.util.Map;

public class DepartmenyRepo {

    private Map <Integer, Department> departmentMap = new HashMap<>();

    public void save(Department department){
        departmentMap.put(department.getId(), department);
    }

    public Department findById(int id) {
        return departmentMap.get(id);
    }

    public void deleteById(int id) {
        departmentMap.remove(id);
    }

    public Map<Integer, Department> findAll() {
        return departmentMap;
    }

    public void update(Department department) {
        departmentMap.put(department.getId(), department);
    }

}
