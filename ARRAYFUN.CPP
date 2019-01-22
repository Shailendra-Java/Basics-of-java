#include<iostream.h>
#include<conio.h>
class ArrayFunction
{
	public:
		void getAvg(int x[], int size)
		{
			int sum = 0, avg = 0;
			for(int i=0; i<size; i++)
			{
				sum += x[i];
			}
			avg = sum/size;
			cout<<"Total = "<<sum<<endl;
			cout<<"Average = "<<avg<<endl;
		}
};