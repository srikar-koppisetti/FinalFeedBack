<!DOCTYPE html>
<html>
<head>
	<title>Feedback</title>
</head>
<body>
	<h1>Feedback Form</h1>
	<form action="addFeedback" method="post">
		Name : <input type="text" name="name"><br>
		Email: <input type="text" name="email"><br>
		Message: <textarea rows="4" cols="30" name="message"></textarea><br>
		Rating: <select name="rating">
				  <option value="1">1</option>
				  <option value="2">2</option>
				  <option value="3">3</option>
				  <option value="4">4</option>
				  <option value="5">5</option>
				</select><br>
		<input type="submit">
		
	</form>
</body>
</html>