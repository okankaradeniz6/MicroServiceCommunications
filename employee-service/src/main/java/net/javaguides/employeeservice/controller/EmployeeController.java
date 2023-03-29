package net.javaguides.employeeservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import net.javaguides.employeeservice.dto.ApiResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;
import net.javaguides.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("save")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>((employeeService.saveEmployee(employeeDto)), HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDto> getEmployeeByID(@PathVariable Long id){
        return new ResponseEntity<>((employeeService.getEmployeeByID(id)), HttpStatus.OK);
    }
}
