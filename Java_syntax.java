

        List<StringBuilder> ans = new ArrayList();
        ans.add(new StringBuilder()); // adds a an empty string.

			if (Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n+i).append(Character.toUpperCase(c));
                }
				
				

				
				

Priority Queue

		// intitalizing and adding
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("C");

				
        PriorityQueue<Student> pq = new PriorityQueue<Student>(5, new StudentComparator());
        Student student1 = new Student("Nandini", 3.2);
        pq.add(student1);
		
		// iterating through priority queue
        Iterator itr1 =  pQueue.iterator();
        while (itr1.hasNext())  {
            System.out.println(itr1.next());
        }
		
		pQueue.poll(); // to remove top element
		
		pQueue.remove("Java"); // to remove specific element
		
		boolean b = pQueue.contains("C"); // to check if the priority queue contains certain value
		
		
		// Priority queue to Array and then printing.
		 Object[] arr = pQueue.toArray();
        System.out.println("Value in array");
        for (int i=0; i<arr.length; i++) {
            System.out.println("Value:" + arr[i].toString());
        }
		
		
		
	stack.empty()
	
	Node >> node.children.values() 
			node.children.putIfAbsent(c, new Node(c)) // to put a node
			node.children.get(c) // to get a node
			
			
	String >> word.compareTo(ans) //return (word - ans)
	
	
		
		
