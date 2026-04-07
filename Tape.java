public class Tape {
    private char [] cells;
    private int head;
    private static final char BLANK = 'B';

    public Tape(String input)
    {
        cells = new char[input.length()+20];

        for(int i=0;i<cells.length;i++)
        {
            cells[i] = BLANK;
        }

        for(int i=0;i<input.length();i++)
        {
            cells[10+i] = input.charAt(i);
        }
        head = 10;
    }
    
    public char read()
    {
        return cells[head];
    }

    public void write(char symbol)
    {
        cells[head] = symbol;
    }

    public void moveLeft()
    {
        if(head > 0) head--;
    }

    public void moveRight()
    {
        if(head<cells.length - 1 ) head++;
    }

    public String getTape()
    {
        StringBuilder sb = new StringBuilder();
        for(char c : cells)
        {
            if(c!= BLANK)
            {
                sb.append(c);
            }
        }
        return sb.toString().isEmpty() ? "B" : sb.toString();
    }

    public int getHead()
    {
        return head;
    }
}