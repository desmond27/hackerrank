import sys
import math

def isFibo(n):
    if(n == 0):
        return False
    base = (5*n*n)
    poss1 = base + 4
    poss2 = base - 4
    return (isPerSq(poss1) or isPerSq(poss2))

def isPerSq(apositiveint):
  x = apositiveint // 2
  seen = set([x])
  while x * x != apositiveint:
    x = (x + (apositiveint // x)) // 2
    if x in seen: return False
    seen.add(x)
  return True
  
t = sys.stdin.readline()
res = []
for n in range(int(t)):
    num = sys.stdin.readline()
    num = int(num)
    if(isFibo(num)):
        res.append("IsFibo")
    else:
        res.append("IsNotFibo")
        
for r in res:
    print(r)

