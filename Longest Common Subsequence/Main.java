def ls(s1,s2,m,n):
  if m==0 or n==0:
    return 0
  elif s1[m-1]==s2[n-1]:
    return 1+ls(s1,s2,m-1,n-1)
  else:
    return max(ls(s1,s2,m-1,n),ls(s1,s2,m,n-1))
s1 = input()
s2 = input()
print(ls(s1,s2,len(s1),len(s2)))