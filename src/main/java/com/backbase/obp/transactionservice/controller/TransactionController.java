package com.backbase.obp.transactionservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.backbase.obp.transactionservice.entity.Transaction;
import com.backbase.obp.transactionservice.entity.Transactions;
import com.backbase.obp.transactionservice.entity.res.TotalAmountRes;
import com.backbase.obp.transactionservice.entity.res.TransactionRes;
import com.backbase.obp.transactionservice.entity.res.TransactionsRes;
import com.backbase.obp.transactionservice.util.TransactionUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="Transaction Management System")
public class TransactionController {
	private Logger log = Logger.getLogger(TransactionController.class);
		
   	@Autowired
   	RestTemplate restTemplate;

	// Get All Transactions
	@ApiOperation(value = "View a list of available transactions", nickname = "getTransactions", response = TransactionsRes.class)
	@GetMapping("/transactionService/v1/transactions")
	public TransactionsRes getTransactions(){
		
		HttpHeaders headers 				= new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity 			= new HttpEntity<>(headers);
		Transactions bodyList 				= null;
		TransactionsRes transactionsRes		= new TransactionsRes();
		
		bodyList = (Transactions) restTemplate.exchange(
				"https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
				HttpMethod.GET, 
				entity, 
				Transactions.class).getBody();
		
		if (bodyList != null) {
			TransactionUtil util 	= new TransactionUtil();
			transactionsRes 		= util.setTransactionsMapper(bodyList);
		}
		return transactionsRes;
	}
	
	// Get Transaction
	@ApiOperation(value = "View requested id transaction", nickname = "getTransaction", response = TransactionsRes.class)
	@GetMapping("/transactionService/v1/transaction/{id}")
	public TransactionsRes getTransaction(@PathVariable(value = "id") String id){
		
		HttpHeaders headers 				= new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity 			= new HttpEntity<>(headers);
		Transactions transactions 			= new Transactions();
		List<Transaction> trans				= new ArrayList<>();
		Transaction body 					= null;
		TransactionsRes transactionsRes		= new TransactionsRes();
		
		body = (Transaction) restTemplate.exchange(
				"https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions/"+id+"/transaction",
				HttpMethod.GET, 
				entity, 
				Transaction.class).getBody();
		
		trans.add(body);
		transactions.setTransactions(trans);
		
		if (body != null) {
			TransactionUtil util 	= new TransactionUtil();
			transactionsRes 		= util.setTransactionsMapper(transactions);
		}
		return transactionsRes;
	}
	
	// Get Total Amount
	@ApiOperation(value = "View total amount for transaction type", nickname = "getTotalAmount", response = TotalAmountRes.class)
	@GetMapping("/transactionService/v1/totalAmount/{transactionType}")
	public TotalAmountRes getTotalAmount(@PathVariable(value = "transactionType") String transactionType){
		
		HttpHeaders headers 				= new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity 			= new HttpEntity<>(headers);
		Transactions bodyList 				= null;
		TransactionsRes transactionsRes		= new TransactionsRes();
		TotalAmountRes totalAmountRes		= new TotalAmountRes();
		Double sum 							= 0.00;
		
		bodyList = (Transactions) restTemplate.exchange(
				"https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
				HttpMethod.GET, 
				entity, 
				Transactions.class).getBody();
		
		if (bodyList != null) {
			TransactionUtil util 	= new TransactionUtil();
			transactionsRes 		= util.setTransactionsMapper(bodyList);
			sum 					= transactionsRes.getTransactions()
										.stream()
										.filter(t -> t.getTransactionType().equalsIgnoreCase(transactionType))
										.mapToDouble(s -> Double.parseDouble(s.getTransactionAmount()))
										.sum();
			totalAmountRes			= util.setTotalAmountMapper(transactionType, sum);
		}
		return totalAmountRes;
	}
}
