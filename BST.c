#include<stdio.h>
#include<conio.h>
struct Node
{
	int data;
	Node* left;
	Node* right;
};
Node* Create(int data)
{
	Node *temp=(struct Node*)malloc(Sizeof(Struct Node));
	temp->data=data;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}
Node* insertion(Node* root,int data)
{
	if(root==NULL)
		return Create(data);
	if(data<root->data)
        root->left=insertion(root->left,data);
    else root->right=insertion(root->right,data);
    return root;
}
void inorder(Node* root)
{
	if(root==NULL)
		return;
	inorder(root->left);
	 printf("%d",root->data);
	 	inorder(root->right);
}
void main()
{
	int i,j;
	Node* root=NULL;
	int arr[20],n;
	clrscr();
	printf("Enter how many number you want to start");
	scanf("%d",&n);
	 printf("Enter %d number",n);
	  for(i=0;i<n;i++)
	  {
	  	scanf("%d",&arr[i]);
	  	root=insertion(root,arr[i]);
	  }

    inorder(root);
}