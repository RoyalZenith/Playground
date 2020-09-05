count=0
for i in input().split():
  if i==i[::-1]:
    count= count+1
print(count)