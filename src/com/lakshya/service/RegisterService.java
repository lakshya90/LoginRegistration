package com.lakshya.service;

import java.util.List;

import com.lakshya.model.*;;

public interface RegisterService {


	   List<Register> getAll() throws Exception;
	   
	   Register create(Register register) throws Exception;
	   
}
