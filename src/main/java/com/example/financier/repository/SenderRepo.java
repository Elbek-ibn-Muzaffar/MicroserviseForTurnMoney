package com.example.financier.repository;

import com.example.financier.domains.MoneySenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SenderRepo extends JpaRepository<MoneySenderEntity, Long> {

}
