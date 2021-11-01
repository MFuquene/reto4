package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
