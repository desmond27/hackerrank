t = int(input())
student = {}
for i in range(t):
	inp = input().split()
	student[inp[0]] = ((float(inp[1]) + float(inp[2]) + float(inp[3])) / 300) * 100
inp1 = input()
print("%.2f" % student[inp1])