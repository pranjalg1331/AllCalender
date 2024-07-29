package com.example.GanakgyanTech.AllCalender.configurations;

import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.GanakgyanTech.AllCalender.data.repositories")
public class DatabaseConfig {
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(MongoClients.create("mongodb+srv://ganakgyan:DZuUAxfEoqqkeRnD@cluster0.hvkwsp9.mongodb.net/festivalDB?retryWrites=true&w=majority"), "festivalDB");
//    }
    // Configuration beans if needed
}