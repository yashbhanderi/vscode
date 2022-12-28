from msilib.schema import Error
import pywhatkit

try:
    pywhatkit.sendwhatmsg('+918140279748', 'Message 1', 16, 47)
except:
    print(Error)