#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Student
{
  char name[30];
  char rollno[30];
  float cgpa;
  struct Student *next;
};
struct Student *head = NULL;
struct Student *
create ()
{
  char s[30];
  struct Student *temp;
  char name[30], rollno[30];
  float cgpa;
  gets (s);
  printf ("\nEnter name: ");
  gets (name);			//scanf("%s",&name);
  printf ("\nEnter roll no.: ");
  gets (rollno);		//scanf("%s",&rollno);
  printf ("\nEnter CGPA: ");
  scanf ("%f", &cgpa);
  temp = (struct Student *) malloc (sizeof (struct Student));
  strcpy (temp->name, name);
  strcpy (temp->rollno, rollno);
  temp->cgpa = cgpa;
  return temp;
}

struct Student *
insertAtIndex (struct Student *current, struct Student *node, int index)
{
  struct Student *head_backup = current;
  if (index == 0)
    {
      node->next = head;
      return node;
    }
  else if (index > size (head))
    {
      printf ("\nIndex Out Of Bound");
      return head_backup;
    }
  int count = 0;
  while (current != NULL)
    {
      if (count + 1 == index)
	{
	  node->next = current->next;
	  current->next = node;
	}
      current = current->next;
      count++;
    }
  return head_backup;
}

struct Student *
insert (struct Student *current, struct Student *node)
{
  head = current;
  if (head == NULL)
    {
      return node;
    }
  while (current->next != NULL)
    {
      current = current->next;
    }
  current->next = node;
  return head;
}

int
giveIndex (struct Student *current, char key[])
{
  int count = 0;
  while (current != NULL)
    {
      if (strcmp (key, current->rollno) == 0)
	{
	  return count;
	}
      current = current->next;
      count++;
    }
  return -1;
}

int
size (struct Student *current)
{
  int count = 0;
  while (current != NULL)
    {
      count++;
      current = current->next;
    }
  return count;
}

int
isEmpty ()
{
  if (size (head) == 0)
    {
      return 1;
    }
  return 0;
}

struct Student *
delete (struct Student *current, char key[])
{
  int index = giveIndex (current, key);
  printf ("%d", index);
  struct Student *head_backup = current;
  if (index == -1)
    {
      printf ("\nElement not in list.");
      return current;
    }
  else if (index == 0)
    {
      return current->next;
    }
  int count = 0;
  while (current != NULL)
    {
      if (count + 1 == index)
	{
	  current->next = current->next->next;
	}
      current = current->next;
      count++;
    }
  return head_backup;
}

void
search (struct Student *current, char key[])
{
  while (current != NULL)
    {
      if (strcmp (current->rollno, key) == 0)
	{
	  printf ("\n Student details found");
	  printf ("\nName: %s", current->name);
	  printf ("\nRoll no.:%s", current->rollno);
	  printf ("\nCGPA: %.2f", current->cgpa);
	}
      current = current->next;
    }
}

void
display (struct Student *current)
{
  while (current != NULL)
    {
      printf ("\nName: %s", current->name);
      printf ("\nRoll no.:%s", current->rollno);
      printf ("\nCGPA: %.2f", current->cgpa);
      current = current->next;
    }
}

void
main ()
{
  int ch = 0;
  while (ch != 8)
    {
      printf ("\n1. Append data");
      printf ("\n2. Add data at a specific index.");
      printf ("\n3. Delete");
      printf ("\n4. Search");
      printf ("\n5. Display");
      printf ("\n6. isEmpty");
      printf ("\n7. Size");
      printf ("\n8. Exit\n");
      scanf ("%d", &ch);
      if (ch == 1)
	{
	  head = insert (head, create ());
	}
      else if (ch == 2)
	{
	  int index;
	  printf ("\nSpecify the index: ");
	  scanf ("%d", &index);
	  head = insertAtIndex (head, create (), index);
	}
      else if (ch == 3)
	{
	  char id[30];
	  printf ("\nRoll no.: ");
	  scanf ("%s", &id);
	  head = delete (head, id);
	}
      else if (ch == 4)
	{
	  char id[30];
	  printf ("\nRoll no.: ");
	  scanf ("%s", &id);
	  search (head, id);
	}
      else if (ch == 5)
	{
	  display (head);
	}
      else if (ch == 6)
	{
	  if (isEmpty ())
	    {
	      printf ("\nList is empty.");
	    }
	  else
	    {
	      printf ("\nNot empty");
	    }
	}
      else if (ch == 7)
	{
	  printf ("%d", size (head));
	}
    }
}
