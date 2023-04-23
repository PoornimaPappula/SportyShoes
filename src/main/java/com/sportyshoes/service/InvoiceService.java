package com.sportyshoes.service;

import java.time.LocalDate;
import java.util.List;

import com.sportyshoes.dto.OrderDetailsDto;
import com.sportyshoes.entity.Cart;
import com.sportyshoes.entity.Invoice;

public interface InvoiceService {

	Invoice findById(int id);
	List<Invoice> findAll();
	Invoice save(Invoice invoice, Cart cart);
	List<OrderDetailsDto> findByDate(LocalDate fromDate, LocalDate toDate);
	List<OrderDetailsDto> invoiceGenerator(List<Invoice> invoices);
	List<OrderDetailsDto> findByCategory(int categoryId);
	Invoice save(Invoice invoice);
	List<OrderDetailsDto> findAllOrders();
	
}
