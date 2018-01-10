package com.pbp333.springbootapp.springBootApp.services;

import com.pbp333.springbootapp.springBootApp.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToDoService {

    private static List<ToDo> toDos = new ArrayList<>();
    private static int toDoCount = 3;

    static{

        toDos.add(new ToDo(1, "me","Learn w1", new Date(), false));
        toDos.add(new ToDo(2, "me","Learn w2", new Date(), false));
        toDos.add(new ToDo(3, "me","Learn w3", new Date(), false));
    }

    public List<ToDo> getToDos(String user){

        List<ToDo> filteredToDos = new LinkedList<>();

        for(ToDo toDo : toDos){
            if(toDo.getUser().equals(user)){
                filteredToDos.add(toDo);
            }
        }
        return filteredToDos;
    }

    public void addTodo(String user, String desc, Date date, boolean isDone){
        toDos.add(new ToDo(toDos.size()+1, user, desc, date, isDone));
    }
    public void addToDos(int id, String user, String desc, Date date, boolean isDone){
        toDos.add(new ToDo(id, user, desc, date, isDone));
    }

    public void deleteToDo(int id){
        Iterator<ToDo> iterator = toDos.iterator();

        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
            }
        }
    }
}

