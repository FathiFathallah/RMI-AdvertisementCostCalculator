# Remote Method Invocation - Advertisement Cost Calculator

  This is an RMI (Remote Method Invocation) system designed for an advertisement company's cost calculation services.<br>
  The system consists of one client and two servers, "server1" and "server2", each offering different cost computation formulas based on the number of days an advertisement runs.<br>
    <\t>• Server1: Computes the cost of the advertisement using the formula: cost = days * 10.
    <\t>• Server2: Computes the cost of the advertisement using the formula: cost = days * 10 - days * 0.05.
  Features:<br>
    • User Management: Add, remove, update, and list users effortlessly. Maintain crucial user information such as userID, username, password, firstName, lastName, and status (blocked or active).<br>
    • IP Blacklisting: Maintain a dynamic blacklist of IP addresses, preventing unauthorized access. Easily add or remove IP addresses from the blacklist to enhance security measures, similar to access lists.<br>
    • File Control: Store user-specific files in a well-organized manner. Associate users with their respective files using the files table (userID, fileName). Actual file content is securely stored in the server's designated directory.<br>
    • Administrative Actions: Administer user actions directly from the server software interface. Block/unblock users by their usernames or IP addresses. When blocked, users are prevented from accessing the server, and detailed block reasons are conveyed via textual messages.<br>
  <br>
  User Scenario:<br>
    • User Authentication: only upon successful login, users gain access to upload and download files securely from the server. a user would get files only uploaded by his/her side.<br>
    • Access Control: Users can be blocked based on their username and/or IP address. In such cases, the server promptly sends informative messages detailing the reasons for the block, enhancing transparency.<br>
<br>
  Apparatus: Python 3 | Python Modules to download: tkinter for GUI | Database with the Server (Change database info in dbConnection.py) <br>

![](1-client.png)
![](2-ServerbeforeBlock.png)
![](3-download.png)
![](2-Server.png)
![](11.png)
