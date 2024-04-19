<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/8/2024
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm bệnh án</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
</head>
<body>
<fieldset>
    <legend style="padding: 20px">Thông tin bệnh nhân</legend>
    <form onsubmit="return validateFormCreate()" action="/benhNhanServlet?action=create" method="post" style="padding: 20px">
        <div class="col-6">
            <label for="maBenhAn" class="form-label">Mã bệnh án: </label>
            <input type=text class="form-control" id="maBenhAn"  width="90px" name="maBenhAn" placeholder="Ví dụ: BA-XXX">
        </div>
        <div class="col-6">
            <label for="maBenhNhan" class="form-label">Mã bệnh nhân: </label>
            <input type=text class="form-control" id="maBenhNhan"  width="90px" name="maBenhNhan" placeholder="Ví dụ: BN-XXX">
        </div>

        <div class="col-6">
            <label for="tenBenhNhan" class="form-label">Tên bệnh nhân: </label>
            <input type="text" class="form-control" id="tenBenhNhan"  name="tenBenhNhan"placeholder="Ví dụ: abc">
        </div>
        <div class="col-6">
            <label for="ngayNhapVien" class="form-label">Ngày nhập viện: </label>
            <input type="text" class="form-control" id="ngayNhapVien" name="ngayNhapVien">
        </div>
        <div class="col-6">
            <label for="ngayRaVien" class="form-label">Ngày ra viện: </label>
            <input type="text" class="form-control" id="ngayRaVien" name="ngayRaVien">
        </div>
        <div class="col-6">
            <label for="liDoNhapVien" class="form-label">Lí do nhập viện: </label>
            <input type="text" class="form-control" id="liDoNhapVien" name="liDoNhapVien">

        </div>
<%--        <div class="col-6">--%>
<%--            <p>Mã bệnh án</p>--%>
<%--          //  <select class="form-select" aria-label="Default select example" id="maBenhAn" name="maBenhAn">--%>
<%--                <option value="">---chọn---</option>--%>
<%--&lt;%&ndash;                <c:forEach items="${maBenhAn.list}" var="mba">&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <option value="${mba.idMaBenhAn}" >${mba.tenBenhAn}</option>&ndash;%&gt;--%>
<%--&lt;%&ndash;                </c:forEach>&ndash;%&gt;--%>
<%--            </select>--%>
<%--        </div>--%>
<%--        <div class="col-6">--%>
<%--            <p>Nhà sản xuất</p>--%>
<%--            <select class="form-select" aria-label="Default select example" id="nhaSanXuat" name="nhaSanXuat">--%>
<%--                <option value="">---Chọn---</option>--%>
<%--                <c:forEach items="${nhaSanXuatList}" var="nsx">--%>
<%--                    <option value="${nsx.getIdNhaSanXuat()}" >${nsx.getTenNhaSanXuat()}</option>--%>
<%--                </c:forEach>--%>
<%--            </select>--%>
<%--        </div>--%>
        <button type="submit" class="btn btn-primary" style="width: 150px; margin:20px">Submit</button>
    </form>
</fieldset>
<script>
    function validateFormCreate() {
        var maMatHangRegex = /^MH-\d{3}$/;
        // var hoTenMatHangRegex = /^[\p{L}\s]{3,}$/u;
        var hoTenMatHangRegex = /^[\w\s]{3,}$/;
        // var giaRegex = /^[1-9]\d*$/;
        var giaRegex = /^\d+(\.\d+)?$/
        var soLuongRegex = /^[1-9]\d*$/;


        var maMatHang = document.getElementById("maMatHang").value;
        var tenMatHang =document.getElementById("tenMatHang").value;
        var gia = document.getElementById("gia").value;
        var soLuong = document.getElementById("soLuong").value;
        var loaiMatHang = document.getElementById("loaiMatHang").value;
        var nhaSanXuat = document.getElementById("nhaSanXuat").value;

        var isValid = true
        if(!maMatHang || !tenMatHang || ! gia || !soLuongRegex || !soLuong || !loaiMatHang || !nhaSanXuat){
            alert("Vui lòng điền đầy đủ thông tin!");
            isValid = false;
            return isValid;
        }
        if(!maMatHangRegex.test(maMatHang)){
            alert("Mã mặt hàng không hợp lệ");
            isValid = false
        }
        if(!hoTenMatHangRegex.test(tenMatHang)){
            alert("Tên mặt hàng phải nhiều hơn 3 kí tự");
            isValid = false
        }
        if(!giaRegex.test(gia)){
            alert("giá phải lớn hơn 0");
            isValid = false
        }
        if(!soLuongRegex.test(soLuong) || soLuong <= 0){
            alert("số lượng phải lớn hơn 0");
            isValid = false
        }
        return isValid;

    }

</script>


</body>
</html>
