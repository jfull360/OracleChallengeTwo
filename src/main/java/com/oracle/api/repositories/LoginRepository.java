package com.oracle.api.repositories;

import com.oracle.api.entities.LoginC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Repository
public interface LoginRepository extends JpaRepository<LoginC, Long> {

    @Query(value = "SELECT c FROM LoginC c WHERE c.userLogin = :var1 AND c.password = :var2 ")
    List<LoginC> getUser(@Param("var1") String User, @Param("var2") String Pass);

}
