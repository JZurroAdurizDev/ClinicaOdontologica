<%-- 
    Document   : index
    Created on : 27 ago 2024, 23:06:56
    Author     : Jabier Zurro Aduriz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<%@ include file="components/head.jsp" %>

<body id="page-top">
    <!-- Page Wrapper -->
    <div id="wrapper">
        
        <%@ include file="components/sidebar.jsp" %>
        
        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
                <%@ include file="components/topbar.jsp" %>

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h1 mb-0 text-gray-800">Clínica Odontológica</h1>
                    </div>
                    <img src="https://th.bing.com/th/id/OIP.WFgeap-SRY_c4CSXUCntdgHaE8?pid=ImgDet&rs=1" alt="foto_odontologo"/>
                </div>
                <!-- End of Page Content -->

            </div>
            <!-- End of Main Content -->

            <%@ include file="components/footer.jsp" %>

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <%@ include file="components/logoutModal.jsp" %>

    <%@ include file="components/scripts.jsp" %>

</body>

</html>
