class StackDemo
{
    private int Max;
    private char[] kokila;
    private int TOS;

    public StackDemo(int s)
    {
        Max=s;
        kokila = new char[Max];
        TOS= -1;
    }
    public void push (char x)
    {
        if(isfull()){
            System.out.println (" Stack is full");
        }
        else{
            kokila[++TOS]=x;
        }
    }

    public boolean isfull()
    {
        return TOS == Max-1;
    }

}
    class Harith
    {
        public static void main(String args[])
        {
            StackDemo Esoft= new StackDemo(5);
            Esoft.push('A');
            Esoft.push('B');
            Esoft.push('C');
            Esoft.push('D');
            Esoft.push('E');
            Esoft.push('F');


        }
    }



    
