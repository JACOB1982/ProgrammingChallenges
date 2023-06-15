def Func4(num):
    sum=0
    rep=4
    tmp1=num
    print("Number passed is ",num )
    print("Number of repititions is  ", rep)
    if rep<2:
        sum=tmp1 * rep
    else:
        while (rep>0):
            tmp2= func(rep)
            #print("inside Func4-sum", tmp2)
            sum = sum+ (tmp1 * tmp2)
            rep=rep-1
    return sum

def func(x):
    var=1
    while (x>=2):
        x=x-1
        var=var+pow(10,x)
        #print("inside Func-var", var)
    return var

# call the function
total = Func4(3)
print("the sum is ", total)