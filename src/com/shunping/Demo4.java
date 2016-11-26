package com.shunping;

/**
 * Created by dryst on 2016/11/24.
 * Fun：where is the handkerchief
 */
public class Demo4 {

    public static void main(String []args)
    {
        CycLink cyclink=new CycLink();
        cyclink.setLen(8);
        cyclink.createLink();
        cyclink.setK(2);
        cyclink.setM(2);
        cyclink.show();
        //System.out.println("len="+cyclink.len+", k="+cyclink.k+", m="+cyclink.m);
        cyclink.play();
    }
}

//Circular Linked List
class CycLink
{
    //first, define a pointer to the first child
    //the reference of the first child can not be changed
    Child firstChild=null;
    Child temp=null;
    int len=0;//how many children
    int k=0;
    int m=0;

    //set m
    public void setM(int m)
    {
        this.m=m;
    }

    //set the length of the list
    public void setLen(int len)
    {
        this.len=len;
    }

    //set the child who will start counting
    public void setK(int k)
    {
        this.k=k;
    }

    //start to play
    public void play()
    {
        System.out.println("start play,len="+this.len+", k="+this.k+", m="+this.m);
        Child temp=this.firstChild;
        //1. find the first guy who will start counting
        for(int i=1;i<k;i++)
        {
            temp=temp.nextChild;
            //System.out.println("Start from no "+ temp.no);
        }

        while(this.len!=1) {
            //System.out.println("start while");
            //2. count down m
            for (int j = 1; j < m; j++) {
                temp = temp.nextChild;
            }

            //3. kick out the child count m
            //find the child before the child who will be kicked out this time
            Child temp2 = temp; //System.out.println("temp2 no="+temp2.no);
            while (temp2.nextChild != temp) {
                temp2 = temp2.nextChild;
            }
            //kick out the child
            System.out.println("kick out no "+temp.no);
            temp2.nextChild = temp.nextChild;
            //let temp point to the next child will start counting
            temp = temp.nextChild;
            //this.show();
            this.len--;
        }
        System.out.println("the last child is "+temp.no);
    }

    //initial circular linked list
    public void createLink()
    {
        for(int i=1;i<=len;i++)
        {
            //create the first child
            if(i==1){
                Child ch=new Child(i);
                this.firstChild=ch;
                this.temp=ch;
            }else if(i==len)
            {
                Child ch=new Child(i);
                temp.nextChild=ch;
                temp=ch;
                temp.nextChild=this.firstChild;
            }
            else
            {
                //continue create child
                Child ch=new Child(i);
                temp.nextChild=ch;
                temp=ch;
            }
        }
    }

    //Print this Circular Linked list
    public void show()
    {
        Child temp=this.firstChild;
        do{
            System.out.println(temp.no);
            temp=temp.nextChild;
        }while(temp!=this.firstChild);
    }
}

class Child
{
    int no;
    Child nextChild=null;

    public Child(int no)
    {
        this.no=no;
    }
}