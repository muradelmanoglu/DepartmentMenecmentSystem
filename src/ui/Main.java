package ui;

import repo.DepartmenyRepo;
import service.DepartmentService;

public class Main {
    static void main(String[] args) {

        DepartmenyRepo departmenyRepo = new DepartmenyRepo();
        DepartmentService departmentService = new DepartmentService(departmenyRepo);


        departmentService.add(1, "Satış Şöbəsi", "Ağa Biznes Mərkəzi");
        departmentService.add(2, "İT Şöbəsi", "Ağa Biznes Mərkəzi");
        departmentService.add(3, "Marketing Şöbəsi", "Ağa Biznes Mərkəzi");
        departmentService.add(4, "Təhsil Şöbəsi", "Ağa Biznes Mərkəzi");

        departmentService.printAll();
        System.out.println("------------------------------------");

        departmentService.deleteById(2);

        System.out.println(departmentService.getById(1));
        System.out.println("------------------------------------");

        departmentService.update(3, "Reklam Şöbəsi", "Ağa Biznes Mərkəzi");
        System.out.println("------------------------------------");

        departmentService.printAll();

    }
}
