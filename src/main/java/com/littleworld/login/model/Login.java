
package com.littleworld.login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;


}

