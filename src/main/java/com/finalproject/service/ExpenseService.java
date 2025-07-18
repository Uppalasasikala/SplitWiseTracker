package com.finalproject.service;

import com.finalproject.Repo.ExpenseRepo;
import com.finalproject.entity.ExpenseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepo expenseRepo;

    public List<ExpenseEntity> getAllExpenses() {
        return expenseRepo.findAll();
    }

    public ExpenseEntity saveExpense(ExpenseEntity expense) {
        return expenseRepo.save(expense);
    }
}
