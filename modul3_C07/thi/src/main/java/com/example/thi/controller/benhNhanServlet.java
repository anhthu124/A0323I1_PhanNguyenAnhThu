package com.example.thi.controller;

import com.example.thi.dto.BenhNhanDto;
import com.example.thi.model.BenhNhan;
import com.example.thi.service.BenhNhanService;
import com.example.thi.service.IBenhNhanService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "benhNhanServlet", value = "/benhNhanServlet")
public class benhNhanServlet extends HttpServlet {
    private IBenhNhanService benhNhanService = new BenhNhanService();
  //  private ILoaiKhachhangService loaiKhachhangService = new LoaiKhachHangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFromCreate(request,response);
                break;
            case "edit":
                showFormUpdate(request,response);
                break;
            case "search":
                showFromSearch(request,response);
                showFromSearchByMaMatHang(request,response);
                break;
            default:
                showList(request,response);
                break;
        }
    }

    private void showFromSearchByMaMatHang(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameSearch");
       // List<BenhNhanDto> list = benhNhanServlet.searchProductByMaMatHang(name);
      //  request.setAttribute("list",list);
        request.setAttribute("name",name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFromSearch(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameSearch");
     //   List<ProductDto> list = productService.searchProductByName(name);
       // request.setAttribute("list",list);
        request.setAttribute("name",name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) {
      //  List<LoaiMatHang> loaiMatHangList = loaiKhachhangService.showlist();
      //  List<NhaSanXuat> nhaSanXuatList = nhaSanXuatService.showList();
        int id = Integer.parseInt(request.getParameter("id"));
      //  ProductDto productDto = productService.selectProduct(id);
//        request.setAttribute("productDto",productDto);
//        request.setAttribute("loaiMatHangList",loaiMatHangList);
//        request.setAttribute("nhaSanXuatList",nhaSanXuatList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFromCreate(HttpServletRequest request, HttpServletResponse response) {
//        List<LoaiMatHang> loaiMatHangList = loaiKhachhangService.showlist();
//        List<NhaSanXuat> nhaSanXuatList = nhaSanXuatService.showList();
//        request.setAttribute("loaiMatHangList",loaiMatHangList);
//        request.setAttribute("nhaSanXuatList",nhaSanXuatList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<BenhNhanDto> list = benhNhanService.showList();
        request.setAttribute("list",list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
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
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
            //    createProduct(request,response);
                break;
            case "edit":
               // UpdateProduct(request,response);
                break;
            case "search":
                showFromSearch(request,response);
                showFromSearchByMaMatHang(request,response);
                break;
            case "delete":
               // deleteProduct(request,response);
                break;
            default:
                showList(request,response);
                break;
        }
    }

//    private void UpdateProduct(HttpServletRequest request, HttpServletResponse response) {
//        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
//        String maMatHang = request.getParameter("maMatHang");
//        String tenMaHang= request.getParameter("tenMatHang");
//        float gia = Float.parseFloat(request.getParameter("gia"));
//        int soLuong = Integer.parseInt(request.getParameter("soLuong"));
//        int idLoaiMatHang = Integer.parseInt(request.getParameter("loaiMatHang"));
//        int idNhaSanXuat = Integer.parseInt(request.getParameter("nhaSanXuat"));
//        Product product = new Product(idProduct,maMatHang,tenMaHang,gia,soLuong,idLoaiMatHang,idNhaSanXuat);
//        productService.updateProduct(product);
//        try {
//            response.sendRedirect("/benhNhanServlet");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void createBenhNhan(HttpServletRequest request, HttpServletResponse response) {
          String maBenhAn = request.getParameter("maBenhAn");
          String maBenhNhan= request.getParameter("maBenhNhan");
        String tenBenhNhan=request.getParameter("ten_benh_nhan");
//        Date ngayNhapVien=request.getParameter("ngay_nhap_vien");
//        Date ngayRaVien=request.getParameter("ngay_ra_vien");
//        String liDoNhapVien=request.getParameter("li_do_nhap_vien");
//        benhNhanService.createBenhNhan(BenhNhan);
        try {
            response.sendRedirect("/benhNhanServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        productService.deleteProduct(id);
//        try {
//            response.sendRedirect("/benhNhanServlet");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
