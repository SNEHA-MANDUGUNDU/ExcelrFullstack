class V
{
    public static void main(String[] args) 
	{
        int i = 0;
		//      1  +   1   +1    + 1 ==> 4
		int j = ++i + i-- + ++i + i +//
		    i-- + i + --i + i +//
		 	++i + i++ + --i + i +//
			--i + i + i-- + i +//
			++i + --i + ++i + i +//
			--i + i + --i + i +//
			++i + i++ + --i + i +//
			i-- + i + i-- + i;//
        System.out.println(i);
		System.out.println(j);
    }
}
