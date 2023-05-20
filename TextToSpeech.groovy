String location ="C:\\Users\\bradk\\Documents\\gridlockkk.txt"

File f = new File(location)

String contents = f.text

println "Starting to speak"

int chunkSize =500

int numChunks = contents.size()/chunkSize

for(int i=0;i<contents.size() && !Thread.interrupted();i+=chunkSize){
	println "Chunk number "+i;
	BowlerStudio.speak(contents.substring(i,i+500))
	Thread.sleep(1)
}

