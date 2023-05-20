String location ="C:\\Users\\bradk\\Documents\\gridlockkk.txt"

File f = new File(location)

String contents = f.text

//println contents

BowlerStudio.speak(contents.substring(0,500))