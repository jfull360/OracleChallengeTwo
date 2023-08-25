package com.oracle.api.services;

import com.oracle.api.entities.LoginC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oracle.api.entities.Reservas;
import com.oracle.api.repositories.LoginRepository;
import java.util.List;

/**
 *
 * @author JORGE DOMINGUEZ
 */

@Service
public class LoginService{
    
    @Autowired
    private final LoginRepository loginS;
    
    public LoginService(LoginRepository s){
        this.loginS = s;
    }
     
    public LoginC Save(){
      LoginC lo = new LoginC();
      lo.setUserLogin("AluraOracle");
      lo.setPassword("1234");
      return loginS.save(lo);
    }
    
    public List<LoginC> CheckLogin(String User, String Pass){
      return loginS.getUser(User, Pass);
    }
    
    public List<LoginC> ListaUsers(){
      return loginS.findAll();
    }
    
}