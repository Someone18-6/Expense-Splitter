package com.Shasank.SplitSmart.repository;

import com.Shasank.SplitSmart.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository
        extends JpaRepository<Expense,Integer> {
}