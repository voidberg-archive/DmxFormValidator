[![No Maintenance Intended](http://unmaintained.tech/badge.svg)](http://unmaintained.tech/)

Demotix Android Form Validator
==============================

This framework allows you to validate inputs of text fields and text views in a convenient way. It is a port of the [ustwo™ iOS Form Validator](https://github.com/ustwo/US2FormValidator "ustwo™ iOS Form Validator"). It's developed at [Demotix.com](http://www.demotix.com/ "Demotix.com") by [Alexandru Badiu](http://ctrlz.ro).

It's currently work in progress. Contributions welcome.

Latest version is [1.1](https://github.com/voidberg/DmxFormValidator/raw/master/releases/formvalidation-1.1.jar).

Features
--------

* Know what went wrong and where
* Create own conditions using regular expressions for example
* Create own validators which contain a collection of conditions

Installation
------------

* Download the latest release and add the jar to your project.
* Or drop the sources into your project.

Usage
-----

### Use a built-in validator

    // Get the text that we want to validate
    String password = editPassword.getText().toString();

    // Create a range validator and set the range to 5 - 50 chars
    DmxValidatorRange passValidator = new DmxValidatorRange();

    passValidator.setRange(5, 50);

    // Validate the password
    DmxConditionCollection passErrors = passValidator.checkConditions(password);

    // Check if there are errors
    StringBuilder errors = new StringBuilder();
    if (passErrors.count() > 0) {
      errors.append("The password must be at least 5 characters.");
    }

### Combining conditions

    // Get the text that we want to validate
    String email = editEmail.getText().toString();
    
    // Create an empty validator
    DmxValidator emailValidator = new DmxValidator();
    // Create an email condition
    DmxConditionEmail emailCondition = new DmxConditionEmail();
    // Create a range condition to make sure the user entered something
    DmxConditionRange emptyCondition = new DmxConditionRange();

    // Set the range to 1 - 50 to make sure some text is entered
    emptyCondition.min = 1;
    emptyCondition.max = 50;

    // Add the conditions to our validator
    emailValidator.addCondition(emailCondition);
    emailValidator.addCondition(emptyCondition);
    
    // Validate the email
    DmxConditionCollection emailErrors = emailValidator.checkConditions(email);

    // Check if there are errors
    StringBuilder errors = new StringBuilder();
    if (passErrors.count() > 0) {
      errors.append("The email address is not correct.");
    }
    
  
