<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>customer Confirmation</title>
</head>
<body>
<h2>
The Customer is Confirmed:${customer.firstName} ${customer.lastName}
</h2>
<h2>
free Passes : ${customer.freePasses}
</h2>
<h2>
Postal Code : ${customer.postalCode}
</h2>
<h2>
Course Code : ${customer.courseCode}
</h2>
</body>
</html>