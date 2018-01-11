class MultiD_Array
{
	public static void main(String a[])
	{
		
		int b[][][]={{{10,20},{30,40}},{{50,60},{70,80}}};
		int i,j,k;
		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				for(k=0; k<2; k++)
				{
					System.out.println("b["+i+"]["+j+"]["+k+"]= "+b[i][j][k]);
				}
			}
		}
	}
}