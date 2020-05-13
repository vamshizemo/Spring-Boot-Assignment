package com.vamshi.springboot.mytodolist.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "todolist")
@Data
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @NotNull(message="is required")
    @Column(name = "description")
    public String description;


    @Column(name = "category", insertable=false)
//    @Column(name = "category")
    public String category;


    @Column(name = "status", insertable=false)
    public String status="todo";

    @Column(name = "date")
    public String date;

}
