<%@ page contentType = "text/html; charset = UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
  <script type="text/javascript">
  	var data = eval(${data});
  </script>
  
  <script>
     var mainApp = angular.module("mainApp", []);
     mainApp.controller('UserController', function($scope) {
    	 $scope.users = data;
     });
  </script>
</head>
<body>

<div class="container">
	<h2>${message}</h2>
	<button type="button" class="btn btn-default btn-sm pull-right margin-bottom-5">
      <span class="glyphicon glyphicon-plus"></span> Plus
    </button>
	<div ng-app = "mainApp" ng-controller = "UserController">
		<table class="table">
           <tr>
              <th>Name</th>
              <th>Gender</th>
              <th>BirthDate</th>
           </tr>
           <tr ng-repeat = "user in users">
              <td>{{ user.name }}</td>
              <td>{{ user.gender }}</td>
              <td>{{ user.birthdate }}</td>
           </tr>
        </table>
	</div>
</div>

</body>
</html>
