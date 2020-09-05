#Install pytesseract using pip install pytesseract
#Import pytesseract 

import pytesseract
from PIL import Image

#Also download Tesseract-OCR for Windows in your system & provide a path below
pytesseract.pytesseract.tesseract_cmd = r'E:/Tesseract-OCR/tesseract.exe'

imageData = Image.open('newcoding.jpg') #Provide name of your image
extractedText = pytesseract.image_to_string(imageData)

print(extractedText)
