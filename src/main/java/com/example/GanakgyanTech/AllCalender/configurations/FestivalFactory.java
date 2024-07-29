package com.example.GanakgyanTech.AllCalender.configurations;

import com.example.GanakgyanTech.AllCalender.data.domain.FestivalEntity;
import com.example.GanakgyanTech.AllCalender.services.FestivalBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class FestivalFactory {
    private final Map<String, FestivalBaseService> RepoMap;

    public FestivalBaseService getFestivalService(String dbType) {
//        if ("mysql".equalsIgnoreCase(dbType)) {
//            return mySqlUserRepository;
//        } else if ("mongodb".equalsIgnoreCase(dbType)) {
//            return mongoUserRepository;
//        }
//        throw new IllegalArgumentException("Unknown database type: " + dbType);
        return RepoMap.get(dbType);
    }
}
