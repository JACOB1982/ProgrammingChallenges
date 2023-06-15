def Func2(Arr1,Arr2):
    Tmp=[]
    i=0
    j=0
    flag=1
    while i < len(Arr1):
        #print("Array1", Arr1[i])
        tmp1=Arr1[i]
        for tmp2 in Arr2:
            #print("Array2",tmp2)
            if (tmp1==tmp2):
                #print("same value found")
                for tmp3 in Tmp:
                    #print ("inside temp array", tmp3)
                    if (tmp3==tmp2):
                        flag=0
                    else:
                        flag=1
                    #print("flag value",flag)
                if flag==1:
                    Tmp.append(tmp1)
        i=i+1
    print("FInal Array:", Tmp)


    # call the function
arr1=[1,4,3,6,7,8,9,0]
print("First Array",arr1)
arr2=[2,3,4,1]
print("Second Array",arr2)
Func2(arr1,arr2)