import java.util.Scanner;
public class Graphs
{
// draws 5 histograms
public void drawHistograms()
{
Scanner input = new Scanner( System.in );

int number1 = 0;
int number2 = 0;
int number3 = 0;
int number4 = 0;
int number5 = 0;

int inputNumber; // number entered by user
int value = 0; // number of stars to print
int counter = 1; // counter for current number
while ( counter <= 5 )
{
System.out.print( "Enter number: " );
inputNumber = input.nextInt();
// define appropriate num if input is between 1-30
if ( inputNumber >= 1 && inputNumber <= 30 )
{
switch ( counter )
{
case 1:
number1 = inputNumber;
break; // done processing case
case 2:
number2 = inputNumber;
break; // done processing case
case 3:
number3 = inputNumber;
break; // done processing case
case 4:
number4 = inputNumber;
break; // done processing case
case 5:
number5 = inputNumber;
break; // done processing case
} // end switch
counter++;
} // end if
else
System.out.println(
"Invalid Input\nNumber should be between 1 and 30" );
} // end while
//print histograms
for ( counter = 1; counter <= 5; counter++ )
{
switch ( counter )
{
case 1:
value = number1;
break; // done processing case
case 2:
value = number2;
break; // done processing case
case 3:
value = number3;
break; // done processing case
case 4:
value = number4;
break; // done processing case

case 5:
value = number5;
break; // done processing case
}
for ( int j = 1; j <= value; j++ )
System.out.print( "*" );
System.out.println();
} // end for loop
} // end method drawHistograms

}