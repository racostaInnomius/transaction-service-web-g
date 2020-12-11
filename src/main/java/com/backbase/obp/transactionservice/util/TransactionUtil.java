package com.backbase.obp.transactionservice.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.backbase.obp.transactionservice.entity.Transactions;
import com.backbase.obp.transactionservice.entity.res.TotalAmountRes;
import com.backbase.obp.transactionservice.entity.res.TransactionRes;
import com.backbase.obp.transactionservice.entity.res.TransactionsRes;

public class TransactionUtil {
	private Logger log = Logger.getLogger(TransactionUtil.class);
	public TransactionsRes setTransactionsMapper(Transactions transactionsReq) {
		List<TransactionRes> transactions 	= new ArrayList<>();
		TransactionsRes transactionsRes 	= new TransactionsRes();
		
		transactionsReq.getTransactions().forEach(transaction -> {
			TransactionRes transactionRes 		= new TransactionRes();
			transactionRes.setId(transaction.getId());
			transactionRes.setAccountId(transaction.getThisAccount().getId());
			transactionRes.setCounterpartyAccount(transaction.getOtherAccount().getNumber());
			transactionRes.setCounterpartyName(transaction.getOtherAccount().getHolder().getName());
			transactionRes.setCounterPartyLogoPath(transaction.getOtherAccount().getMetadata().getImageURL());
			transactionRes.setInstructedAmount(transaction.getDetails().getValue().getAmount());
			transactionRes.setInstructedCurrency(transaction.getDetails().getValue().getCurrency());
			transactionRes.setTransactionAmount(transaction.getDetails().getValue().getAmount());
			transactionRes.setTransactionCurrency(transaction.getDetails().getValue().getCurrency());
			transactionRes.setTransactionType(transaction.getDetails().getType());
			transactionRes.setDescription(transaction.getDetails().getDescription());
			transactions.add(transactionRes);
		});
		transactionsRes.setTransactions(transactions);
		return transactionsRes;
	}
	public TotalAmountRes setTotalAmountMapper(String transactionType, Double sum) {
		TotalAmountRes amountRes 	= new TotalAmountRes();
		amountRes.setTransactionAmount(sum);
		amountRes.setTransactionType(transactionType);
		return amountRes;
	}

}
