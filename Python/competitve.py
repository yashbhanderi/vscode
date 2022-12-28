def accepted():
    n = int(input())
    k = 1
    while k < (n * 2):
        cnt = 0;i = 1;j = n
        while i<j:
            if (i+j)==k:
                cnt+=1;i+=1;j-=1
            elif (i+j)<k: i+=1
            else: j-=1
        print(k,cnt)
        k+=1

ts = int(input())
while ts > 0:
    accepted()
