/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.isp.assessment.todo;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Produces;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david
 */
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RestController
public class TodoController {
    
    private List<Task> tasks;
    
    public TodoController(){
        this.tasks = new ArrayList();
        Task task = new Task(false,"Initial Task","");
        tasks.add(task);
    }
    
    public List<Task> getTasks(){
        return this.tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    @RequestMapping("/tasks")
    public List<Task> getTasksList(){
        return getTasks();
    }

    @PostMapping(value = "/post", consumes = "application/json", produces = "application/json")
    public Task postTask2(@RequestBody Task task){
        getTasks().add(task);
        return task;
    }
    
    @RequestMapping(value="/delete", method = DELETE)
    public void deleteTasks(){
        this.tasks.clear();
    }
}
