package stackoverflow.main;

import stackoverflow.Data;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main{
	public static void main(String[] args){

		// Load Stackoverflow Data
		Data data = Data.loadFromWeb();

		  // stream()
		System.out.println("First method: Unsorted questions");
		// TODO Test the stream() Method
		
		System.out.println(); System.out.println();
		
		  // sortedStream()
		System.out.println("Second method: Sorted questions based on score ");
		// TODO Test the sortedStream() Method
		
		System.out.println(); System.out.println();
		
		  // findHighestScoringQuestionWith()
		System.out.println("Third method: Highest scoring question with minimum of 2 million views");
		// TODO Test the findHighestScoringQuestionWith() Method
		
		System.out.println(); System.out.println();
		
		  // getLongestTitle()
		System.out.println("Fourth method: The longest title of all questions");
		// TODO Test the getLongestTitle() Method
				
		System.out.println(); System.out.println();
		
		  // findQuestions()
		System.out.println("Fifth method: Find quesitons that contain the word 'Java' in their title");
		// TODO Test the findQuestions() Method
		
		System.out.println(); System.out.println();
		
		  // countQuestionsWithoutAcceptedAnswer()
		System.out.println("Sixth method: Question count with no accepted answers");
		// TODO Test the countQuestionsWithoutAcceptedAnswer() Method
			
		System.out.println(); System.out.println();
		
		  // averageOwnerReputation()
		System.out.println("Seventh method: Average owner reputation");
		// TODO Test the averageOwnerReputation() Method
				
		System.out.println(); System.out.println();
		
		  // averageOwnerReputation2()
		System.out.println("Eighth method: Also average owner reputation");
		// TODO Test the averageOwnerReputation2() Method
		
		System.out.println(); System.out.println();
		
		  // sumOfAllAnswerCounts()
		System.out.println("Ninth method: Total sum of all answers of every question");
		// TODO Test the sumOfAllAnswerCounts() Method

		System.out.println(); System.out.println();

		// getOwnerWithShortestName()
		System.out.println("Tenth method: Owner with the shortest name");
		// TODO Test the getOwnerWithShortestName() Method
		
		System.out.println(); System.out.println();
		
		  // groupQuestionsByTagCount()
		System.out.println("Eleventh method: Questions grouped by tag count");
		// OPTIONAL TODO Test the groupQuestionsByTagCount() Method

		System.out.println(); System.out.println();
		
		  // partitionByAcceptedAnswer()
		System.out.println("Twelfth method: Questions partitioned into groups of answered and not answered");
		// OPTIONAL TODO Test the partitionByAcceptedAnswer() Method
		
		System.out.println(); System.out.println();
		
		  // distinctTags()
		System.out.println("Thirteenth method: List of all distinct tags");
		// OPTIONAL TODO Test the distinctTags() Method
		
		System.out.println(); System.out.println();
	}
}