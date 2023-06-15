def gentext(n):
    exterior='[]'
    right=']'
    left='['
    if(isvalidnum(n)):
        print("valid")
    else:
        print("wrong format")
        exit(1)

    if (n==0):
        print(exterior)
    if (n>0):
        print(left+genarray(n)+right)

def isvalidnum(n):
    if (n>0)and(n%1==0):
        return 1
    else:
        return 0

def genarray(n):
    right1 = ']'
    left1 = '['
    seperator=','
    text=''
    var=1
    while (var<=n):
        if (n==1 or var==n):
            text = text+left1+gennum(var)+right1
        else:
            text = text + left1 + gennum(var) + right1 + seperator
        var=var+1
    return text

def gennum(n):
    seperator1=','
    text1=''
    var1=1
    if (n==0):
        text1=''
    else:
        for var1 in range(n):
            if (var1==0):
                text1=text1+str(var1+1)
            else:
                text1 = text1+seperator1 + str(var1 + 1)

    return text1

#print (gennum(4))
#print (genarray(4))
gentext(7)