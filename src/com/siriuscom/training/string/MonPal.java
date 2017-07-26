package com.siriuscom.training.string;


public class MonPal 
{
	
	public static StringBuffer getNature(String sentence)
	{
		StringBuffer nameOne = new StringBuffer();
		StringBuffer nameTwo = new StringBuffer();
		
		boolean oneIsMono, oneIsPal;
		boolean twoIsMono, twoIsPal;
		
		int i;
		
		StringBuffer sentenceBuffer = new StringBuffer(sentence);
		StringBuffer output = new StringBuffer();
		
		int tempIndex1 = sentenceBuffer.indexOf("\"") + 1;
		int tempIndex2 = sentenceBuffer.indexOf("\"", tempIndex1);
		if(tempIndex1 == 0 || tempIndex2 == -1)
		{
			output.append("No names in sentence.");
			return output;
		}
		
		
		nameOne.append(sentenceBuffer.subSequence(tempIndex1, tempIndex2));
		StringBuffer nameOneInitials = new StringBuffer();
		nameOneInitials.append(nameOne.subSequence(0, 1));
		int tempIndex = nameOne.indexOf(" ") + 1;
		while(tempIndex > 0)
		{
			nameOneInitials.append(nameOne.subSequence(tempIndex, tempIndex + 1));
			tempIndex = nameOne.indexOf(" ", tempIndex) + 1;
			
		}
		
		oneIsPal = true;
		for(i = 0;i < nameOneInitials.length()/2;++i)
		{
			if(nameOneInitials.charAt(i) != nameOneInitials.charAt((nameOneInitials.length()-1)-i))
			{
				oneIsPal = false;
				break;
			}
		}
		
		if(oneIsPal)
		{
			oneIsMono = true;
			for(i = 1;i < nameOneInitials.length();++i)
			{
				if(nameOneInitials.charAt(i) != nameOneInitials.charAt(i - 1))
				{
					oneIsMono = false;
				}
			}
		}
		else
		{
			oneIsMono = false;
		}
		
		if(oneIsMono)
		{
			output.append(nameOne + " is Monotonous |");
		}
		else if(oneIsPal)
		{
			output.append(nameOne + " is Palonomic |");
		}
		else
		{
			output.append(nameOne + " is No-One |");
		}
		
		tempIndex1 = sentenceBuffer.indexOf("\"", tempIndex2 + 1) + 1;
		tempIndex2 = sentenceBuffer.indexOf("\"", tempIndex1);
		if(tempIndex1 == 0 || tempIndex2 == -1)
		{
			//only one name per sentence
			return output;
		}
		
		nameTwo.append(sentenceBuffer.subSequence(tempIndex1, tempIndex2));
		StringBuffer nameTwoInitials = new StringBuffer();
		nameTwoInitials.append(nameTwo.subSequence(0, 1));
		tempIndex2 = nameTwo.indexOf(" ") + 1;
		while(tempIndex2 > 0)
		{
			nameTwoInitials.append(nameTwo.subSequence(tempIndex2, tempIndex2 + 1));
			tempIndex2 = nameTwo.indexOf(" ", tempIndex2) + 1;
			
		}
		
		
		twoIsPal = true;
		for(i = 0;i < nameTwoInitials.length()/2;++i)
		{
			if(nameTwoInitials.charAt(i) != nameTwoInitials.charAt((nameTwoInitials.length()-1)-i))
			{
				twoIsPal = false;
				break;
			}
		}
		
		if(twoIsPal)
		{
			twoIsMono = true;
			for(i = 1;i < nameTwoInitials.length();++i)
			{
				if(nameTwoInitials.charAt(i) != nameTwoInitials.charAt(i - 1))
				{
					twoIsMono = false;
				}
			}
		}
		else
		{
			twoIsMono = false;
		}
		
		if(twoIsMono)
		{
			output.append(" " + nameTwo + " is Monotonous |");
		}
		else if(twoIsPal)
		{
			output.append(" " + nameTwo + " is Palonomic |");
		}
		else
		{
			output.append(" " + nameTwo + " is No-One |");
		}
		
		if(nameTwoInitials.toString().equals(nameOneInitials.toString()))
		{
			output.append(" " + nameOne + " and " + nameTwo + " are twins");
		}
		else
		{
			output.append(" " + nameOne + " and " + nameTwo + " are not twins");
		}
		return output;
	}
	
	
}
