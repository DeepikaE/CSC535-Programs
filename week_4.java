public class Week_4programming 

{

public static void main(String[] args)

{

int size=7;

int[] list = new int[]{12345, 35, 627, 91, 1, 9999, 221};

int lo = 0;

int hi = size-1;

System.out.println("Numbers in the array Before Sorting");

for (int i= 0; i<size; ++i)

{

System.out.println(list[i]);

}

divide(list, lo, hi);


System.out.println("Numbers in the array after Sorting");

for (int i= 0; i<size; ++i)

{

System.out.println(list[i]);

}



}

public static void divide(int[]list, int lo, int hi )

{

if(lesser < greater)

{

int mid = (lo + hi)/2;

divide(list, lo, mid);

divide(list, mid+1, hi);

mergesort(list, lo, mid, hi);


}

}

public static void mergesort(int[]list, int lo, int mid, int hi)

{

int s = array.length;

int[]temp = new int[s];

for(int i = lo; i <= hi; ++i)

{

temp[i] = list[i];

}

int a = lo;

int b = mid+1;

int c = lo;

while(a <= mid && b <= hi)

{

if(temp[a] <= temp[b])

{

list[c]= temp[a];

++a;

}

else

{

list[c]= temp[b];

++b;

}

++c;

}

while (a<= mid)

{

list[c]=temp[a];

++c;

++a;


}

}

}

