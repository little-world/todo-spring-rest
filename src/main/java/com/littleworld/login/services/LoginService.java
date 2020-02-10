
package com.littleworld.login.services;

import com.littleworld.login.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginService extends CrudRepository<Login, Integer> {

}

