Welcome to Cryptanalyzer

<br>To get started, enter the arguments in this order:

<b>command filePath key</b>

+ <b>command</b> - three available options: [ENCRYPT, DECRYPT, BRUTE_FORCE]

+ <b>filepath</b> - absolute (full) path to the file to be encoded.

+ <b>key</b> - an integer, a key for shifting the alphabet. 

<br>If there are spaces or special characters in the path to the jar file or to the text file...

<b>(* / \ $ % & # @ ! ( ) { } [ ] , ; ' ” < > | ^ ~.`)</b>

...then enclose such a path in double quotes.

java -jar "c:/My Project/target/my App.jar" ENCRYPT "folder name/textFile1.txt" 20

<br>In case of transfer ENCRYPT/DECRYPT key is mandatory.

<br>As a result of the program, a file with the same name as the input file, but marked [ENCRYPTED] / [DECRYPTED] will appear in the folder with the initial file, depending on the operation performed.


