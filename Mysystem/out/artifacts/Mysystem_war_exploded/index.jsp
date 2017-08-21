<jsp:useBean id="student" scope="request" type=""/>
<%--
  Created by IntelliJ IDEA.
  User: Niwanthi Nilakshana
  Date: 8/18/2017
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

  <title></title>

  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />

  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="assets/font/font-awesome.min.css" />

  <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/material-kit.min.css" rel="stylesheet"/>
  <link href="assets/css/custome.css" rel="stylesheet"/>
</head>

<body class="index-page">

<div class="page-header header-filter">
  <div class="container">
    <div class="row">
      <div class="col-md-10 col-md-offset-1 well A">
        <div class="col-md-6">
          <h3>Add Students here....</h3>
        </div>
        <div class="col-md-6">
          <button class="btn btn-success pull-right" type="button" data-toggle="collapse" data-target="#demo">
            <i class="fa fa-plus"></i> Create
          </button>
        </div>
      </div>
    </div>

    <div class="row collapse" id="demo">
      <div class="col-md-10 col-md-offset-1 well">

        <form class="form" method="POST" action="DoCreateStudentServlet">

          <div class="card-content">
            <div class="col-md-6">
              <div class="input-group">
								    <span class="input-group-addon">
								    	<i class="material-icons">local_activity</i>
								    </span>
                <input type="text" class="form-control" name="stu_id" placeholder="Enter ID..." value="${student.stu_Id}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
								    <span class="input-group-addon">
								    	<i class="material-icons">face</i>
								    </span>
                <input type="text" class="form-control" name="stu_name" placeholder="First Name..." value="${student.stu_Name}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
								    <span class="input-group-addon">
								    	<i class="material-icons">person_pin</i>
								    </span>
                <input type="text" class="form-control" name="stu_add" placeholder="Enter Address..." value="${student.stu_Add}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">email</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_email" placeholder="Email..." value="${student.stu_Email}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">local_phone</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_Tel" placeholder="Tel No..." value="${student.stu_Tel}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">cake</i>
				            	   </span>
                <input type="date" class="form-control" name="stu_dob" placeholder="DOB..." value="${student.stu_Dob}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">accessibility</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_age" placeholder="Age..." value="${student.stu_Age}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">wc</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_Gender" placeholder="Gender..." value="${student.stu_Gender}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">public</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_nat" placeholder="Nationality..." value="${student.stu_Nat}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
				            	   <span class="input-group-addon">
				            	   	<i class="material-icons">folder_special</i>
				            	   </span>
                <input type="text" class="form-control" name="stu_Rel" placeholder="Religion..." value="${student.stu_Rel}">
              </div>
            </div>
            <div class="col-md-6">
              <div class="input-group">
								    <span class="input-group-addon">
								    	<i class="material-icons">add_a_photo</i>
								    </span>


                <span class="btn btn-default btn-file">
                                        Upload  <input id="file-upload-photo-pictures" multiple="" type="file">
                                    </span>
              </div>
            </div>

          </div>

          <div class="col-md-12">
            <div class="footer text-right">
              <a href="studentList" class="btn btn-danger  btn-wd btn-md">Cancel</a>
              <a href="" class="btn btn-primary  btn-wd btn-md">Submit</a>
            </div>
          </div>

        </form>

      </div>
    </div>

  </div>

  <div class="container">
    <div class="row">
      <div class="col-md-10 col-md-offset-1 well x">
        <div class="panel panel-default animated fadeInRight">
          <div class="table-responsive">
            <table class="table table-bordered table-hover">
              <thead>
              <tr>
                <th>ID</th>
                <th>Poster</th>
                <th>Name</th>
                <th>CreatedAt</th>
                <th>Operation</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>${student.stu_Id}</td>
                <td style="text-align:center;">
                  <div class="media">
                    <img alt="Image" class="img-responsive img-circle" src="${student.stu_img}" style="width: 30px;">
                  </div>
                </td>
                <td>${student.stu_Name}</td>
                <td>2017-08-17</td>
                <td class="w">
                                        <span class="op-col" style="text-align: center;">
                                            <button class="btn btn-warning btn-xs" type="button">
                                                 <i class="fa fa-edit"><a href="editStudent"></i>
                                            </button>
                                            <button class="btn btn-danger btn-xs" type="button">
                                                 <i class="fa fa-trash-o"><a href="deleteStudent"></i>
                                            </button>
                                            <button class="btn btn-info btn-xs" type="button" data-toggle="modal" data-target="#myModal">
                                                 <i class="fa fa-eye"><a href="previewStudent"></i>
                                            </button>
                                        </span>
                </td>
              </tr>
              </tbody>
            </table>
          </div>

          <div class="panel-footer">
            <pagination class="pagination-sm ng-untouched ng-pristine ng-valid" firsttext="«" lasttext="»" nexttext="›" previoustext="‹">
              <ul class="pagination pagination-sm">
                <li class="pagination-first page-item disabled">
                  <a class="page-link" href="">«</a>
                </li>

                <li class="pagination-prev page-item disabled">
                  <a class="page-link" href="">‹</a>
                </li>

                <li class="pagination-page page-item active">
                  <a class="page-link" href="">1</a>
                </li>

                <li class="pagination-next page-item disabled">
                  <a class="page-link" href="">›</a></li>

                <li class="pagination-last page-item disabled">
                  <a class="page-link" href="">»</a></li>
              </ul>
            </pagination>
            <h4 class="text-muted">Total: 1</h4>
          </div>
        </div>

      </div>
    </div>
  </div>

  <div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

      <!-- Modal content-->
      <form class="form" method="get" action="PreviewServlet">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h5 class="modal-title">Student Details</h5>
          </div>
          <div class="modal-body">
            <div class="row">
              <div class="col-md-5">
                <h4>Poster :</h4>
              </div>
              <div class="col-md-7">
                <h4> <img src="assets/img/01.jpg" class="img-responsive"> </h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>ID :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Id}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Name :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Name}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Address :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Add}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Email :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Email}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Tel No :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Tel}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>DOB :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Dob}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Age :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Age}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Gender :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Gender}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Nationality :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Nat}</h4>
              </div>
            </div>
            <div class="row">
              <div class="col-md-5">
                <h4>Religion :</h4>
              </div>
              <div class="col-md-7">
                <h4 class="l">${student.stu_Rel}</h4>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</body>
<!--  JS Files   -->
<script src="assets/js/jquery.min.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/js/material.min.js"></script>
<script src="assets/js/material-kit.min.js" type="text/javascript"></script>

</html>

