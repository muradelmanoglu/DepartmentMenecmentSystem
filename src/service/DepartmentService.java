package service;

import model.Department;
import repo.DepartmenyRepo;

public class DepartmentService {

    private DepartmenyRepo departmenyRepo;

    public DepartmentService(DepartmenyRepo departmenyRepo) {
        this.departmenyRepo = departmenyRepo;
    }

    public void add(int id, String name, String location) {
        if (departmenyRepo != null) {
            Department newDepartment = new Department(id, name, location);
            departmenyRepo.save(newDepartment);
            System.out.println("Yeni Departament Yaradılldı.");
        }
    }

    public Department getById(int id){
        return departmenyRepo.findById(id);
    }

    public void deleteById(int id){
        departmenyRepo.deleteById(id);
    }

    public void printAll() {
        for (Department department : departmenyRepo.findAll().values()){
            System.out.println(department);
        }
    }

    public void update(int id, String name, String location) {
        Department existingDepartment = departmenyRepo.findById(id);
        if (existingDepartment != null) {
            existingDepartment.setName(name);
            existingDepartment.setLocation(location);
            departmenyRepo.update(existingDepartment);
        }
    }



}
