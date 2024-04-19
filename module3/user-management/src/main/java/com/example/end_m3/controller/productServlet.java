package com.example.end_m3.controller;

import com.example.end_m3.model.Product;

import com.example.end_m3.service.IProductService;
import com.example.end_m3.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "productServlet", value = "/productServlet")
public class productServlet extends HttpServlet {
    IProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
//            case "delete":
//                deleteProduct(request,response);
//                break;
            default:
                showList(request,response);
                break;

        }
    }
    private void showList(HttpServletRequest request, HttpServletResponse response){
        List<Product> list = productService.showList();
        request.setAttribute("list",list );
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "create":
                createNewProduct(request,response);
                break;
//            case "delete":
//                deleteProduct(request,response);
//                break;

            default:
                showList(request,response);
                break;

        }
    }
    private void createNewProduct(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        int price = request.getIntHeader("price");
        int quantity = request.getIntHeader("quantity");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        productService.addNewProduct(new Product(name,price,quantity,color,description,category));
        try {
            response.sendRedirect("/productServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private void deleteProduct(HttpServletRequest request, HttpServletResponse response){
//        int id = Integer.parseInt(request.getParameter("id"));
//        productService.deleteProduct(id);
//
//        try {
//            response.sendRedirect("/productServlet");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
