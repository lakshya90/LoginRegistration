package com.lakshya.repository.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.lakshya.model.*;
import com.lakshya.repository.AbstractRepository;

@Repository("userRepository")
public class UserRepository extends AbstractRepository<Register> {
    
	@SuppressWarnings("unchecked")
    public List<Register> getAll() {
        
        return entityManager.createQuery("SELECT * FROM register r ORDER BY r.firstname").getResultList();
        
    }
	
}
