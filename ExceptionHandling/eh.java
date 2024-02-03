f = open("file1.txt", 'w')
r1 = f.read()
d1 = f.write("today is friday")


g = open("file2.txt", 'w')
r2 = f.read()
d2 = g.write("today is not friday and this is file 2")


f.close()
g.close()

## merging a new file 
h = open("file3.txt", 'a')


