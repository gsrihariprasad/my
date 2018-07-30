1. From Arrays

String[] arr = { "program", "creek", "program", "creek", "java", "web",
		"program" };
stream = Stream.of(arr);
-------------------------------
stream = Stream.of("program", "creek", "program", "creek", "java",
		"web", "program");
String[] stringArr = {"a", "b", "c", "d"};
Stream<String> stream = Arrays.stream(stringArr);

===========================================

2. From Collections

// from collection
List<String> list = new ArrayList<String>();
list.add("java");
list.add("php");
list.add("python");
stream = list.stream();
-----------------------------------


===========================================


3. Use Stream.generate()


// generate()
Stream<String> stream = Stream.generate(() -> "test").limit(10);
String[] strArr = stream.toArray(String[]::new);
System.out.println(Arrays.toString(strArr));
3. Use Stream.generate()


===========================================


4. Use Stream.iterate()

// iterate()
Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
BigInteger[] bigIntArr = bigIntStream.toArray(BigInteger[]::new);
System.out.println(Arrays.toString(bigIntArr));

===========================================



5. From Popular APIs

// stream method from APIs
String sentence = "Program creek is a Java site.";
Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
String[] wordArr = wordStream.toArray(String[]::new);
System.out.println(Arrays.toString(wordArr));

===========================================
