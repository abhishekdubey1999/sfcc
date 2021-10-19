package com.sapient.trg.util;

public class MyMath {
	public static boolean isPerfectNumber(int n) {
		 int sum = 0;
		 for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }    
		 
	}  
	 
	public static long factorial(int n) {
		 if (n == 0)    
			 return 1;    
		 else    
			 return (n* factorial(n-1));   
	}
	
	public static boolean isPrime(int n) {
		    boolean flag = false;
		    for (int i = 2; i <= n / 2; ++i) {
		      if (n % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      return true;
		    else
		      return false;		
	}
	
	public static long sumOfPrimes(int n) {
		boolean value = isPrime(n);
		System.out.println("Value is prime : " +value);
		
		int i, number, count, sum = 0; 
				
				for(number = 1; number <= n; number++)
				{
					count = 0;
				    for (i = 2; i <= number/2; i++)
				    {
				    	if(number % i == 0)
				    	{
				    		count++;
				    		break;
				    	}
				    }
				    if(count == 0 && number != 1 )
				    {
				    	sum = sum + number;
				    }  
				}
		           return sum;
			
	}
	public static boolean isArmstrongNumber(int n) {
		
		int temp, digits=0, last=0, sum=0;    
		temp=n;   
		while(temp>0)    
		{   
		temp = temp/10;   
		digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{        
		last = temp % 10;   
		sum +=  (Math.pow(last, digits));    
		temp = temp/10;   
		}    
		if(n==sum)    
		return true;      
		else 
		return false;   
		}   
	
	public static int reverseNumber(int n) {
		
		int reverse = 0;  
		while(n != 0)   
		{  
		int remainder = n % 10;  
		reverse = reverse * 10 + remainder;  
		n = n/10;  
		}  
		return  reverse;  		
	}
	
	 public static int decimalToBinary(int n) {
		 
		 
		 int i=1, binary=0, rem;
		 while(n!=0){
			    rem = n%2;
			    binary += i*rem;    //concatenate remainders in bottom-up manner
			    n = n/2;
			    i=i*10;
			}
		 return binary;
	 }
	 
	 public static int binaryToDecimal(int n) {
		 
		 int decimal = 0;  
		    int num = 0;  
		    while(true){  
		      if(n == 0){  
		        break;  
		      } else {  
		          int temp = n%10;  
		          decimal += temp*Math.pow(2, num);  
		          n = n/10;  
		          num++;  
		       }  
		    }  
		    return decimal;  
	 }
	 
	 public static int getSumOfNfibos(int n) {
		 
	        int currentValue = 1, prevValue = 0, sum = 0, temp;

	        if (n <= 0)
	            return 0;

	        if (n == 1)
	            return 1;

	        sum = 1;
	        for (int i = 2; i < n; i++) {
	            temp = currentValue;
	            currentValue = prevValue + currentValue;
	            prevValue = temp;

	            sum += currentValue;
	        }
	        return sum;
		 
	 }
	 
	 public static boolean isPalindromeNumber(int n) {
		 int r,sum=0,temp;     
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return true;    
		  else    
		   return false;     
	 }
	 

	public static void main(String[] args) {
		
		System.out.println(" 6 is perfect number " +MyMath.isPerfectNumber(6));
		System.out.println(" Factorial of 4 is " +MyMath.factorial(4));
		System.out.println("5 is prime " +MyMath.isPrime(5));
		System.out.println(" Sum of prime = " +MyMath.sumOfPrimes(7));
		System.out.println(" 121 is armstrong "+MyMath.isArmstrongNumber(121));
		System.out.println("Reverse of 123 is "+MyMath.reverseNumber(123));
		System.out.println("The binary value of 10 is "+MyMath.decimalToBinary(10));
		System.out.println("The decimal of 100111 is "+MyMath.binaryToDecimal(100111));
		System.out.println("Sum of n fibo is "+MyMath.getSumOfNfibos(9));
		System.out.println("Is 121 a palindrome "+MyMath.isPalindromeNumber(121));
		
			
		

	}

}
