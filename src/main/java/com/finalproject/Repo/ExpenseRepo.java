package com.finalproject.Repo;

import com.finalproject.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<ExpenseEntity, Long> {
}
