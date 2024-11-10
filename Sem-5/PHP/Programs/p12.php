<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>M&S Company</title>
</head>
<body>

<?php
$submitted = false;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $age = $_POST['age'];
    $phone = $_POST['phone'];
    $email = $_POST['email'];
    
    $submitted = true;
}

if (!$submitted) {
    echo '<form action="" method="post">
            <h1>BIO Data</h1>
            <label>Name: </label>
            <input type="text" name="name" required><br>
            <label>Age: </label>
            <input type="text" name="age" required><br>
            <label>Phone: </label>
            <input type="text" name="phone" required><br>
            <label>Email: </label>
            <input type="email" name="email" required><br>
            <button type="submit">Submit</button>
          </form>';
} else {
    
    echo "<center>
    <h2>
    Name: $name<br>
    Age: $age<br>
    Phone: $phone<br>
    Email: $email<br>
    </h2>
    </center>";
}
?>

</body>
</html>