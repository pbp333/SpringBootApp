package com.pbp333.springbootapp.springBootApp.controllers;

import com.pbp333.springbootapp.springBootApp.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@SessionAttributes("name")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(value = "/todo-list", method = RequestMethod.GET)
    public String showToDos(ModelMap modelMap) {

        modelMap.put("todos", toDoService.getToDos("me"));
        return "todo-list";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddToDoPage(ModelMap modelMap) {

        modelMap.put("todos", toDoService.getToDos("me"));
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addToDo(ModelMap modelMap, @RequestParam String desc) {

        System.out.println(modelMap.get("name"));
        toDoService.addTodo((String)modelMap.get("name"), desc, new Date(), false);

        return "redirect:/todo-list";
    }

}
