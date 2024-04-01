package com.example1.demo1.repository;

import com.example1.demo1.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface voterRepo extends JpaRepository<Voter,Long>
{

}
