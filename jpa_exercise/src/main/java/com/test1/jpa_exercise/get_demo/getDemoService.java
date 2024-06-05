package com.test1.jpa_exercise.get_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class getDemoService {

    private getDemoRepository getDemoRepository;

    @Autowired
    getDemoService(getDemoRepository getDemoRepository){
        this.getDemoRepository = getDemoRepository;
    }

    public List<users> findUsers(){
        return getDemoRepository.findUsers();
    }

    public void save(users user){
        getDemoRepository.save(user);
    }
}
