package net.javaguides.departmentservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import net.javaguides.departmentservice.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("create")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto){

        return new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
    }

    @GetMapping("{code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String code){

        return new ResponseEntity<>(departmentService.getDepartmentById(code), HttpStatus.OK);
    }

}
