<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dynamic Form</title>
    <style>
       <jsp:include page="./style/homepagecss.jsp">
           <jsp:param name="pageColor" value="#04AA6D;" />
       </jsp:include>
    </style>
</head>
<header class="header">
    		<h1 class="logo"><a href="./home">${initParam.AppName} </a></h1>
    		<jsp:useBean id="htmlNavbar" class="com.heiwa.surveyapp.view.helper.HtmlNavbar" />
            <jsp:setProperty name="htmlNavbar" property="activeLink" value='${requestScope.activeMenu}' />
            ${htmlNavbar.menu}
</header>
<body>
<div class="formBackground"></div>
<form class="dynamicForm" action= "./createSurvey" method= "post">

    <h1>Create your Survey</h1>

    <div id="formContainer">
        <div class="form-group">
            <label for="title">Title</label>
            <input type="text" placeholder="Enter Survey Title" name="title" required>
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <input type="text" placeholder="Enter Survey Description" name="description" required>
        </div>
        <div class="form-group">
            <label for="question" >Question:</label>
            <input type="text" placeholder="Enter a Question" name="questionText" required>

            <select name="answerType">
                <option value="TEXT">Text</option>
                <option value="MULTIPLE_CHOICE">Multiple Choice</option>
                <option value="RATING_SCALE">Rating Scale</option>
            </select>
        </div>
    </div>

    <button class= "addQuestion" type="button" onclick="addFields()">Add Question </button>

    <button class= "createSurvey" type="submit">Create</button>
</form>

<script>
    function addFields() {
        // Container for new fields
        var formContainer = document.getElementById('formContainer');

        // Create a new div for the form group
        var newFormGroup = document.createElement('div');
        newFormGroup.classList.add('form-group');

        // Create a new label for the field
        var newLabel = document.createElement('label');
        newLabel.textContent = 'Question:';

        // Create a new input field
        var newInput = document.createElement('input');
        newInput.type = 'text';
        newInput.name = 'field' + (formContainer.children.length + 1);

        // Create a new select dropdown for the answer type
        var newSelect = document.createElement('select');
        newSelect.name = 'field' + (formContainer.children.length + 1) + 'Type';

        // Add options to the select dropdown
        var optionText = ['Text', 'Multiple Choice', 'Rating Scale']; // Add more options as needed
        for (var i = 0; i < optionText.length; i++) {
            var option = document.createElement('option');
            option.value = optionText[i].toLowerCase();
            option.textContent = optionText[i];
            newSelect.appendChild(option);
        }

        // Append label, input, and select to the new form group
        newFormGroup.appendChild(newLabel);
        newFormGroup.appendChild(newInput);
        newFormGroup.appendChild(newSelect);

        // Append the new form group to the form container
        formContainer.appendChild(newFormGroup);
    }
</script>

</body>
</html>