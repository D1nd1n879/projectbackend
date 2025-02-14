package org.example;

import org.springframework.beans.factory.annotation.Autowired;


public class Driver {
    private String name;
    @Autowired
    private Team team;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
