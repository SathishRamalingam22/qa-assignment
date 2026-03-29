# Manual Test Cases – Login Module (OrangeHRM)

### TC_01  
• TC ID: TC_01  
• Test description: Verify login with valid credentials  
• Steps:  
  1. Open login page  
  2. Enter valid username  
  3. Enter valid password  
  4. Click Login  
• Expected result: Login should be successful and user should be navigated to dashboard page  
• Priority: High  

### TC_02  
• TC ID: TC_02  
• Test description: Verify forgot password functionality with valid username  
• Steps:  
  1. Open login page  
  2. Click on "Forgot your password?" link  
  3. Enter valid username (Admin)  
  4. Click on Reset Password  
• Expected result: Success message should be displayed indicating reset password link sent successfully  
• Priority: High  

### TC_03  
• TC ID: TC_03  
• Test description: Verify login with valid username and invalid password  
• Steps:  
  1. Open login page  
  2. Enter valid username  
  3. Enter invalid password  
  4. Click Login  
• Expected result: Error message "Invalid credentials" should be displayed  
• Priority: High  

### TC_04  
• TC ID: TC_04  
• Test description: Verify login with invalid username and valid password  
• Steps:  
  1. Open login page  
  2. Enter invalid username  
  3. Enter valid password  
  4. Click Login  
• Expected result: Error message "Invalid credentials" should be displayed  
• Priority: High  

### TC_05  
• TC ID: TC_05  
• Test description: Verify login with empty username  
• Steps:  
  1. Open login page  
  2. Leave username blank  
  3. Enter valid password  
  4. Click Login  
• Expected result: "Required" validation message should be displayed under username field  
• Priority: High  

### TC_06  
• TC ID: TC_06  
• Test description: Verify login with empty password  
• Steps:  
  1. Open login page  
  2. Enter valid username  
  3. Leave password blank  
  4. Click Login  
• Expected result: "Required" validation message should be displayed under password field  
• Priority: High  

### TC_07  
• TC ID: TC_07  
• Test description: Verify login with maximum username length (boundary value)  
• Steps:  
  1. Open login page  
  2. Enter username with maximum allowed length  
  3. Enter password  
  4. Click Login  
• Expected result: Error message "Invalid credentials" should be displayed  
• Priority: Medium  