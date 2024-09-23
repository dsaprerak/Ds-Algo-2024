#include<stdio.h>

int main()
{
    int a[100];
    int n,f,found;

    printf("Enter the number of elements you want :\n");
    scanf("%d",&n);

    for(int i=0;i<n;i++)
    {
        printf("Enter the %d element :\n",i+1);
        scanf("%d",&a[i]);
    }

    printf("Enter the element you to get :\n");
    scanf("%d",&f);

    found =0;

    for(int i =0;i<n;i++)
    {
        if(f==a[i])
        {
            printf("Element %d found at %d position.\n",f,i+1);
            break;
        }
    }

    if(!found)
    {
        printf("Element not found.");
    }

    return 0;
}