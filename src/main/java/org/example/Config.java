package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    Team redBullTeam(){
        Team team=new Team();
        team.setName("Red Bull Racing");
        return team;
    }

    @Primary
    @Bean
    Team ferrariTeam(){
        Team team=new Team();
        team.setName("Scuderia Ferrari");
        return team;
    }

    @Bean
    Driver leclerc() {
        Driver driver = new Driver();
        driver.setName("Charles Leclerc");
        driver.setTeam(ferrariTeam());
        return driver;
    }

    @Bean
    Driver verstappen(){
        Driver driver = new Driver();
        driver.setName("Max Verstappen");
        driver.setTeam(redBullTeam());
        return driver;
    }


}