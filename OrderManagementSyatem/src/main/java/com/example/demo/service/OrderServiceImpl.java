package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.order.Order;
import com.example.demo.repository.OrderRepository;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;

	@Override
	public void exportExcel(HttpServletResponse req) throws Exception{
		List<Order> orders = repository.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Order_Details");
		HSSFRow row = sheet.createRow(3);
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("name");
		row.createCell(2).setCellValue("product");
		row.createCell(3).setCellValue("contactNumber");
		row.createCell(4).setCellValue("email");
		int row_num = 1;
		for (Order ord : orders) {
			row = sheet.createRow(row_num);

			row.createCell(0).setCellValue(ord.getId());
			row.createCell(1).setCellValue(ord.getName());
			row.createCell(2).setCellValue(ord.getProduct());
			row.createCell(3).setCellValue(ord.getContactNumber());
			row.createCell(4).setCellValue(ord.getEmail());
			row_num++;
		}
		
		ServletOutputStream outputStream = req.getOutputStream();
	}

}
