package com.pbp333.springbootapp.springBootApp.controllers;

import com.pbp333.springbootapp.springBootApp.model.ToDo;
import com.pbp333.springbootapp.springBootApp.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

        modelMap.addAttribute("toDo", new ToDo(0, (String) modelMap.get("name"), "", new Date(), false));
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addToDo(ModelMap modelMap, @Valid ToDo toDo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        toDoService.addTodo((String) modelMap.get("name"), toDo.getDesc(), new Date(), false);

        return "redirect:/todo-list";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteToDo(@RequestParam int id) {

        toDoService.deleteToDo(id);

        return "redirect:/todo-list";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateToDo(@RequestParam int id, ModelMap modelMap) {

        ToDo toDo = toDoService.getToDo(id);
        modelMap.addAttribute(toDo);

        return "todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateToDo(ModelMap modelMap, @Valid ToDo toDo, BindingResult result) {

        toDo.setUser((String)modelMap.get("name"));

        if(result.hasErrors()){

            return "todo";
        }

        toDoService.updateToDo(toDo);
        return "redirect:/todo-list";
    }

}
