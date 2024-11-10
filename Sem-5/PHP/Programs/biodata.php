<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <?php
    if (!$isSubmitted) {
        echo '
            <form action="" method="POST">
                <h1 align="center">Bio Data</h1>
                <label for="name">Name: </label>
                <input type="text" name="name" required> <br>
                <label for="age">Age: </label>
                <input type="number" name="age" required> <br>
                <label for="email">Email: </label>
                <input type="email" name="email" required> <br>
            </form>
        ';
    }
    else {
        echo '
        <div align="center">
            <h2>Dio Data</h2>
            <h4>
                Name: $name <br>
                Age: $age <br>
                Email: $email
            </h4>
        </div>
        ';
    }

    if($_SERVER['REQUEST_METHOD'] === 'POST') {
        $name = $_POST['name'];
        $email = $_POST['email'];
        $age = $_POST['age'];
        $isSubmitted = true;
    }

    ?>

</body>

</html>