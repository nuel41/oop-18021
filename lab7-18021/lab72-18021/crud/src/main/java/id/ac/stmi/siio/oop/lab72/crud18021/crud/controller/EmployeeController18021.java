package id.ac.stmi.siio.oop.lab72.crud18021.crud.controller;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.ac.stmi.siio.oop.lab72.crud18021.crud.exception.ResourceNotFoundException18021;
import id.ac.stmi.siio.oop.lab72.crud18021.crud.model.Employee18021;
import id.ac.stmi.siio.oop.lab72.crud18021.crud.repository.EmployeeRepository18021;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController18021 {
    @Autowired
    private EmployeeRepository18021 employeeRepository;

    @GetMapping("/employees")
    public List<Employee18021> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee18021> getEmployeeById(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException18021 {
        Employee18021 employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException18021("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public Employee18021 createEmployee(@Valid @RequestBody Employee18021 employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee18021> updateEmployee(@PathVariable(value = "id") Long employeeId,
            @Valid @RequestBody Employee18021 employeeDetails) throws ResourceNotFoundException18021 {
        Employee18021 employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException18021("Employee not found for this id :: " + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee18021 updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException18021 {
        Employee18021 employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException18021("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
