#include<iostream>
using namespace std;

void selection(int arr[], int n)
{
    for(int i=0; i<n; i++)
    {
        int min=i;

        for(int j=i+1; j<n; j++)
        {
            if(arr[min]>arr[j])
            {
                min=j;   
            }
            
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        
        
    }

    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }

}

int main()
{
    int n;
    cout<<"Enter n: ";
    cin>>n;

    int arr[n];

    cout<<"Enter values:\n";
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }

    selection(arr,n);



    return 0;
}