import java.util.*;
 class prog22
{   String S; String S1=""; String S3; int i; int c=0; int a; String S2="";
     void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        S=sc.nextLine();
    }
   
        
      char chop1(int s)
     {
        
            char ch=S.charAt(s);
            return ch;
        
     }
         
    void encrypt()
     {  for(int i=0;i<S.length();i++)
            { c=0;
            
                   char ch2=chop1(i);
                  int ascii=ch2; double sum;
          if(ch2<='Z'&& ch2>='A')
         {
            
            sum=(ascii*(ascii+1))/2;
            
        }
        else if(ch2<='z'&& ch2>='a')
        {
          
            sum=ascii*(ascii+1)*(2*ascii+1)/6;
        }
        else if(Character.isDigit(ch2))
        {    
            sum=ascii-32;
        }
        else if(ch2==' ')
        {
            sum=ascii+32;
        }
        else
        sum=ch2*2;
        while(sum>128)
        {   sum=sum-100;c=c+1; 
        }   
        S1=S1+(char)sum;a=c; decrypt(sum);
     }
    
     }
     void display()
    {
        encrypt();
        System.out.println("Your encrypted String is "+S1);
    }
     void display2()
    {
        
        System.out.println("Your decrypted String is "+S2);
    }
    
    public void main()
    {
        prog22 obj=new prog22();
        obj.accept();
        obj.display();
        
        obj.display2();
        
    }
    void decrypt(double ch2)
    {  int m=65;
       double ascii=ch2; //sum
         double sum1=ascii+(100*a);int j=97; int t=0;
        if(sum1>=2145 && sum1<=4095)
   {
        while(t<sum1)
        { t=(m*(m+1))/2;m++;
            if(t==sum1)
            {
            S2=S2+(char)(m-1);
            
        
           }
            }
        }
       else if(sum1>= 308945 && sum1<=15006)
       {
        while(t<sum1)
        {
           t=j*(j+1)*((2*j)+1)/6; j++;
            if(t==sum1)
             {
            S2=S2+(char)(j-1); 
          }
        }
    }
    else if(sum1-32==32)
    {
       S2=S2+(char)32;
    }
    else if((sum1+32)>=48 && (sum1+32)<=57)
    {
      S2=S2+(char)(ascii+32);
    }
    else
    {
    ascii=ascii/2; S2=S2+(char)ascii;
       }
  }
 
}


    
    
 