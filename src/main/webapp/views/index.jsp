<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
        <header>
            <h1>Welcome to Robert's website.</h1>
        </header>
        <main style="font-family: monospace">
            <form action="add">
                <label style="width: 150px; display: inline-block">Enter 1st number: <input type="text" name="num1"></label><br>
                <label style="width: 150px; display: inline-block">Enter 2nd number: <input type="text" name="num2"></label><br><br>
                <input type="submit">
            </form>

            <br>
            <br>
            <br>

            <form action="addAlien">
                <label style="width: 150px; display: inline-block">Enter alien id: <input type="text" name="id"></label><br>
                <label style="width: 150px; display: inline-block">Enter alien name: <input type="text" name="name"></label><br><br>
                <input type="submit">
            </form>
        </main>
    </body>
</html>