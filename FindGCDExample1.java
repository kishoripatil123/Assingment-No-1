/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdpat
 */

public class FindGCDExample1   
{  
public static void main(String[] args)   
{  
  
int x = 12, y = 8, gcd = 1;  

for(int i = 1; i <= x && i <= y; i++)  
{  
if(x%i==0 && y%i==0)  
gcd = i;  
}  
System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}  
}  