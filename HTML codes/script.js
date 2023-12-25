document.addEventListener('DOMContentLoaded', function () {
    var form = document.getElementById('infoForm');

    form.addEventListener('submit', function (event) {
        var isValid = true;

        // Validate Student Information
        isValid = isValid && validateAlphabeticField('s_fname', 'First name');
        isValid = isValid && validateAlphabeticField('s_lname', 'Last name');
        isValid = isValid && validateEmail('s_email');
        isValid = isValid && validateField('s_dob', 'Date of Birth');

        // Validate Company Information
        isValid = isValid && validateAlphabeticField('c_name', 'Company name');
        isValid = isValid && validateAlphabeticField('c_job', 'Job title');
        isValid = isValid && validateField('c_startdate', 'Start date');

        // Prevent form submission if validation fails
        if (!isValid) {
            event.preventDefault();
        }
    });

    function validateField(fieldId, fieldName) {
        var field = document.getElementById(fieldId);
        if (field.value.trim() === '') {
            alert(fieldName + ' cannot be empty');
            return false;
        }
        return true;
    }

    function validateEmail(emailId) {
        var emailField = document.getElementById(emailId);
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(emailField.value.trim())) {
            alert('Invalid email format');
            return false;
        }
        return true;
    }

    function validateAlphabeticField(fieldId, fieldName) {
        var field = document.getElementById(fieldId);
        var alphabeticRegex = /^[a-zA-Z]+$/;
        if (!alphabeticRegex.test(field.value.trim())) {
            alert(fieldName + ' should only contain alphabetic characters');
            return false;
        }
        return true;
    }
});