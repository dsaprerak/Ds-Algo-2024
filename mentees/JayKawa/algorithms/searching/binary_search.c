#include <stdio.h>

int compare(const void* a, const void* b) 
{
    return (*(int*)a - *(int*)b);
}

int main()
{
    int n, f, low, high, mid,found;
    int a[100];

    printf("Enter the number of elements you want to store:\n");
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++)
    {
        printf("Enter the %d element:\n", i + 1);
        scanf("%d", &a[i]);
    }

    printf("Enter the element you want to find:\n");
    scanf("%d", &f);

    qsort(a, n, sizeof(int), compare); 
    low = 0;
    high = n - 1;
    found=0;

    while(low <= high)
    {
        mid = (low + high) / 2;

        if(a[mid] == f)
        {
            break;
        }
        else if(f < a[mid])
        {
            high = mid - 1;
        }
        else if(f > a[mid])
        {
            low = mid + 1; 
        }
    }

    if(!found)
    {
        printf("Element not found.");
    }

    return 0;
}
