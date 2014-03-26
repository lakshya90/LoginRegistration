package com.lakshya.service.impl;


import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.controller.repository.impl.UserRepository;
import com.lakshya.model.*;
import com.lakshya.service.RegisterService;

/**
 * provides services for user.
 *
 */
@Service("registerService")
@Transactional(readOnly = true)

public class RegisterServiceImpl implements RegisterService {

	
    @Autowired
    private UserRepository userRepository;
    
    public List<Register> getAll() {

        return userRepository.getAll();
    }
    
    @Transactional(readOnly = false)
    public Register create(Register register) throws ParseException {

    	return userRepository.merge(register);
        
    }
    
}

	
