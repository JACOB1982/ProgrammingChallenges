def add(x,y):
    return x+y

def FIBOEVEN(n):
    x=0
    y=1
    sum=0
    ctr=1
    text = str(x) + ',' + str(y) + ','
    while ctr<=n:
        z = add(x, y)
        text= text + str(z)+','
        if (z%2==0):
            sum=sum + z
            ctr=ctr +1
        x=y
        y=z
    print ("Fibonocci Series :", text)
    print("Sum of "+ str(n) +" even numbers in the list is : ", sum)



FIBOEVEN (100)