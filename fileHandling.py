
## Write lines 
f = open("myFile.txt", 'w')
l = ["Neha\n", "banlskdj\n"]

f.write("Hey")
f.write("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage") 

f.close()

## read no of chars 
a = open("sampleFile.txt", 'r')
data = a.read(12)

print(data)
f.close()

## Read data from text files 
f = open("sampleFile.txt", 'r')
data = f.read()
print(data)

f.close()

## Seek and tell 
with open("myfile.txt", 'r+') as f:
    fileData = f.read()
    print(fileData)
    
    print("Current pos", f.tell())
    f.seek(15)
    print("Current pos:", f.tell())
    
    f.write("hel")
    fileData = f.read()
    print(fileData)
    