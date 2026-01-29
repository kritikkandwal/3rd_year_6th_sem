#include<iostream>
using namespace std;

struct node
{
    int data;
    node *next;

    node(int data)
    {
        this -> data = data;
        next = NULL;
    }
};

node *push(node *head, int data)
{
    node *ptr = new node(data);
    ptr -> next = head;
    head=ptr;

    return head;
}

node *pop(node *head)
{
    if(head==nullptr)
    {
        cout<<"Stack Underflow";
        return head;
    }

    node *temp = head;

    head = temp -> next;
    delete temp;

    return head;
}

void display(node *head)
{
    if(head==NULL)
    {
        cout<<"Empty LL";
    }
    else
    {
        cout<<"Values: ";
        while(head!=nullptr)
        {
            cout<<head-> data <<" ";
            head= head-> next;
        }
    }
}


int main()
{
    node *head = nullptr;

    cout<<"\nPress:\n";
    cout<<"1 to PUSH\n";
    cout<<"2 to POP\n";
    cout<<"3 to Display\n";
    cout<<"4 to Exit\n";

    while(1)
    {
        cout<<"\nEnter Your Choice: ";
        int choice;
        cin>>choice;

        switch(choice)
        {
            case 1:
            int data;
            cout<<"\nEnter the Data: ";
            cin>>data;
            head=push(head,data);
            break;

            case 2:
            head=pop(head);
            break;

            case 3:
            display(head);
            break;

            case 4:
            exit(0);

            default:
            cout<<"Invalid Choice";

        }
    }

    return 0;
}