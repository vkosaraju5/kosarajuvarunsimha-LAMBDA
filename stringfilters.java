import java.util.stream.Stream; 
  
class filterthestrings { 
  
    public static void main(String[] args) 
    { 
        Stream<String> stream = Stream.of("one", "and", "two", "are","all","numbers"); 
        stream.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println); 
    } 
} 