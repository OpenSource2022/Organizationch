f = open("./Jnuchart.txt", "r", encoding="utf-8")
while True:
	line = f.readline().strip()
	if not line: break
	rec = list(line.split('\t'))
	while (len(rec) <5):
		line = f.readline().strip()
		bb = list(line.split('\t')) 
		rec = rec + bb
#		print("BB", bb)
#		print("REC", rec)
#	print(rec)
	qq = "insert into impodata values(" 
	for i in range(len(rec)):
		if ((rec[i]=='') or (rec[i]=='\n')) :
			qq += "NULL, "
		else :
			qq += "'"+rec[i]+"',"
	qq = qq[0:len(qq)-1]+");"
	print(qq)
f.close()
