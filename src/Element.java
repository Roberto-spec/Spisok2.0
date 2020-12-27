public class Element
{
    public int Value;
    public Element Next;
    Element(int value){
        Value=value;
        Next=null;
    }

    public Element getNext() {
        return Next;
    }

    public int getValue() {
        return Value;
    }

    public void setNext(Element next) {
        Next = next;
    }

    public void setValue(int value) {
        Value = value;
    }
    public void show(){
        System.out.print(Value+" ");
        if(Next!=null){
            Next.show();
        }
    }
    public void add(int znach){

        if(Value<znach||Next==null){
            if(Next!=null){
                if(Next.getValue()>znach){
                    Element znach_=new Element(znach);
                    znach_.setNext(getNext());
                    setNext(znach_);
                }
                else {
                    Next.add(znach);
                }
            }
            if(Next==null){
                Element znach_=new Element(znach);
                znach_.setNext(null);
                setNext(znach_);
            }

        }
        else {
            Next.add(znach);
        }
    }
    public void remove(int znach){
        if(Value==znach&&Next!=null){
            Value=Next.getValue();
            Next=Next.getNext();
        }
        if(Next!=null) {
            if (Next.getNext() != null) {
                if (Next.getValue() == znach) {
                    Next = Next.getNext();
                }
                else{
                    Next.remove(znach);
                }


            }
            if (Next.getNext() == null) {
                if (Next.getValue() == znach) {
                    Next = null;
                }


            }
        }
        else{
            Next.remove(znach);
        }

    }

}
