package graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//LeetCode WordLadder problem
public class WordLadder {
	public static class WordNode {
		String word;
		int length;
		
		WordNode(String word) {
			this.word = word;
			this.length = 0;
		}
		
		WordNode(String word, int length) {
			this.word = word;
			this.length = length;
		}
		
		public String getWord() {
			return this.word;
		}
		
		public int getLength() {
			return this.length;
		}
	}
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        Queue<String> q = new LinkedList<String>();
	    //    wordList.add(endWord);
	        int level = 0;
	        q.add(beginWord);
	        while(!q.isEmpty()) {
	        	int size = q.size();
	            for(int j=0; j<size; j++) {
	                String word = q.poll();
	                if(word.equals(endWord)) {
	                    return level;
	                }
	                for(int i=0; i<word.length(); i++) {
	                    char[] wordArr = word.toCharArray();
	                    for(char t = 'a'; t<'z'; t++) {
	                        wordArr[i] = t;
	                        String s = new String(wordArr);
	                        if(!s.equals(word) &&  wordList.contains(s)) {
	                            q.add(s);
	                            wordList.remove(word);
	                        }
	                    }
	                }
	            }
	            level++;
	        }
	        return 0;
	    }
	
	public static void main(String[] args) {
		List<String> dict = new ArrayList<String>();
//		dict.add("hot");
//		dict.add("dot");
//		dict.add("dog");
//		dict.add("lot");
//		dict.add("log");
//		dict.add("cog");
		dict.add("a");
		dict.add("b");
		dict.add("c");
		System.out.println("HelloWorld");
		System.out.println(ladderLength("a", "c", dict));
	}
}
