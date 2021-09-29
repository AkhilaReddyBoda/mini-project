package com.akhilaBank.AkhilaBank.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.akhilaBank.AkhilaBank.models.TransferHistory;

public interface HistoryDAO extends JpaRepository<TransferHistory, Long> {
	
	}


