#Import SMPTPLib and Email libraries

import smtplib
from email.message import EmailMessage

#Function to send an email. 
def email_script(subject, body, to):
    msg = EmailMessage()
    msg.set_content(body)
    msg['subject'] = subject #Subject of your Email
    msg['to'] = to

    user = "sendermail@gmail.com"
    msg['from'] = user
	
	#Enter Temporary Password generated from your Google Account Settings
    password = "abcdefgh"  

	#Using port 587 here
    server = smtplib.SMTP("smtp.gmail.com", 587)

    server.starttls()
    server.login(user, password)
    server.send_message(msg)
    server.quit()

if __name__ == '__main__':
    email_script("#100DaysOfCode", "Hello Arun, Learn how to send an email using Python", "receivermail@gmail.com")
