package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import com.kht.ecommerce.ecommerce_application.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;
    @Override
    public List<KHTBook> getAllBooks() {
        return bookMapper.getAllBooks();
    }
    @Override
    public KHTBook getBookById(int id) {
        return bookMapper.getBookById(id);
    }
    @Override
    public int editBook(KHTBook book) {
        return bookMapper.editBook(book);
    }
    @Override
    public void insertBook(KHTBook book) {

    }
}













