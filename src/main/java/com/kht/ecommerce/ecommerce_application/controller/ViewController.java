package com.kht.ecommerce.ecommerce_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    // 사용자 목록 페이지
    @GetMapping("/")
    public String usersPage() {
        return "index";
    }
    // 책 목록 페이지
    @GetMapping("books")
    public String booksPage() {
        return "books";
    }

    // 유저정보 조회 페이지
    @GetMapping("/user")
    public String userPage(@RequestParam("id")int id) { return "user_detail"; }
    // 책 정보 조회 페이지
    @GetMapping("/book")
    public String bookPage(@RequestParam("id")int id) { return "book_detail"; }

    // 유저정보 수정페이지 조회
    @GetMapping("/user/edit")
    public String userEditPage(@RequestParam("id")int id) {
        return "user_edit";
    }
    // 책 정보 수정페이지 조회
    @GetMapping("/book/edit")
    public String bookEditPage(@RequestParam("id")int id) { return "book_edit"; }

    // 상품 목록 페이지
    @GetMapping("/products")
    public String productsPage() {
        return "products";
    }

    // 상품 상세 페이지
    @GetMapping("/product/")
    public String productPage(@RequestParam("id") int id) { return "product_detail"; }

    // 장바구니 페이지
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }

    // 유저 장바구니 페이지
    @GetMapping("/cart{userId}")
    public String getCartByUserId(@PathVariable("userId") int id) {
        return "cart";
    }

    // 회원가입 페이지 볼 수 있게 회원가입.html 불러오기
    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }

    @GetMapping("/products/insert")
    public String  getProduct() {
        return "insertProduct";
    }

    @GetMapping("/inputEmail")
    public String  getEmail() {
        return "inputEmail";
    }

    // RequestParam 은 url 에 작성 안한다
    @GetMapping("/update/product/{id}")
    public String  updateProduct() {
        return "updateProduct";
    }
}









