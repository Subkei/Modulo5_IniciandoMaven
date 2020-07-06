<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <title>Reportar Accidente </title>
  </head>
  <body>
    <div class="jumbotron">
        <header class="text-center">
            <h2>Reportar Accidente </h2>
        </header>
    </div> 
     <form action="AgregarAccidente">  
      <div class="container">
          <div class="row">
             <label class="col-4" for="" name="idcliente" required ><h5>Id cliente:</h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>              
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          <div class="row">
              <label class="col-4" for="" name="idaccidente" required><h5> Id Accidente:</h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          <div class="row">
              <label class="col-4" for="" name="fecha" required><h5>Fecha:</h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          <div class="row">
              <label class="col-4" for="" name="hora" required><h5>Hora:</h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          <div class="row">
              <label class="col-4" for=""  name="lugar" required ><h5> Lugar:</h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          <div class="row">
              <label class="col-4" for="" name="suceso" required><h5> Suceso: </h5></label>
              <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1"><b>></b></span>
              </div>
              <input type=" text" class="col-6 input-group">
          </div>
          <br><br>
          
           <div class="row">
               <div class="container" style="max-width:55%">
                <input type="submit" class="btn btn-warning col-4" value="volver" formaction="${pageContext.request.contextPath}/index.jsp">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" class="btn btn-warning col-4" value="aceptar">
               </div>
           </div>          
        </div>
      </form> 
      <div class="container" style="height: 50px;"></div>
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.5.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>