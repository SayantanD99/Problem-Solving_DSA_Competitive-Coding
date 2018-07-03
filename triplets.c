/*  Compare The Triplets

Link : https://www.hackerrank.com/challenges/compare-the-triplets/problem */

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
  
int main()
{
    int a0,a1,a2,b0,b1,b2,alicepoints=0,bobpoints=0;
   
        scanf("%d%d%d",&a0,&a1,&a2);
     
        scanf("%d%d%d",&b0,&b1,&b2);
    if(a0>b0){
        alicepoints=alicepoints+1;
    }
    
    if(a1>b1){
        alicepoints=alicepoints+1;
    }
   
    if(a2>b2){
        alicepoints=alicepoints+1;
    }
    if(b0>a0){
        bobpoints=bobpoints+1;
    }
    
    if(b1>a1){
        bobpoints=bobpoints+1;
    }
   
    if(b2>a2){
      bobpoints=bobpoints+1;
    }
    
    if((a0=b0)&&(a1=b1)&&(a2=b2)){
        alicepoints=alicepoints+0;
        bobpoints=bobpoints+0;
    }
    printf("%d %d",alicepoints,bobpoints);
   
   
    return 0;
    
}
