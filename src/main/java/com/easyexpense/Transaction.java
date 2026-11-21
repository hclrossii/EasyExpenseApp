package com.easyexpense;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "İşlem türü (INCOME veya EXPENSE) boş bırakılamaz.")
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @NotNull(message = "Tutar boş bırakılamaz.")
    @Positive(message = "Tutar 0'dan büyük olmalıdır.")
    private Double amount;

    @NotBlank(message = "Açıklama boş bırakılamaz.")
    private String description;

    private LocalDateTime date;

    @PrePersist
    protected void onCreate() {
        this.date = LocalDateTime.now();
    }
}