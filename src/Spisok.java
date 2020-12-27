
    public class Spisok {
        Element head;

        Spisok(int znach){
            head=new Element(znach);

        }
        void add(int znach){
//            Element b=new Element(znach);
//            Element a=head;
//            b.setNext(a);
//            head=b;
            if(head.getValue()>znach){
                Element b=new Element(znach);
                Element a=head;
                b.setNext(a);
            head=b;
            }
            else{
                head.add(znach);
            }

        }
        void remove(int znach){
//            Element a=head.getNext();
//            head=a;

            if(head.getValue()==znach){
                Element a=head.getNext();
                head=a;
            }
            if(head.getNext()!=null){
                if (head.getNext().getNext() != null) {
                    if (head.getNext().getValue() == znach) {
                        head.setNext(head.getNext().getNext())  ;
                    }
                    else{
                        head.getNext().remove( znach);
                    }


                }
                if (head.getNext().getNext() == null) {
                    if (head.getNext().getValue() == znach) {
                        head.setNext(null) ;
                    }


                }

            }


        }

        public Element getHead() {
            return head;
        }
    }


