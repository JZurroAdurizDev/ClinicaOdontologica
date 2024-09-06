<%-- 
    Document   : altaUsuarios
    Created on : 5 sept 2024, 21:23:58
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
                    
                    <h3>Alta Usuarios</h3>
                    <br>
                    
                    <form class="user" action="SvUsuario" method="POST">
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="nombreUsuario"
                                    placeholder="Nombre de Usuario">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="password" class="form-control form-control-user" id="contrasenia"
                                    placeholder="Contraseña">
                            </div>
                            <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="rol"
                                    placeholder="Rol">
                            </div>
                        </div>
                        <button class="btn btn-primary btn-user btn-block" type="submit">
                            Crear Usuario
                        </button>
                    </form>
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