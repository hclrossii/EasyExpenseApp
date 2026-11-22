package com.easyexpense;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public Transaction addTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public double getTotalIncome() {
        return repository.findAll().stream()
                .filter(t -> t.getType() == TransactionType.INCOME)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public double getTotalExpense() {
        return repository.findAll().stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public Map<String, Double> getBalanceSummary() {
        double income = getTotalIncome();
        double expense = getTotalExpense();
        double balance = income - expense;

        Map<String, Double> summary = new HashMap<>();
        summary.put("totalIncome", income);
        summary.put("totalExpense", expense);
        summary.put("balance", balance);
        return summary;
    }
}