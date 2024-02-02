f1 = open('random.jpeg', 'rb')
f2 = open('new_image', 'wb')

bytes = f1.read()
f2.write(bytes)

print(bytes)
print("New image")