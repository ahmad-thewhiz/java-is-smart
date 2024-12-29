// 2.
// abstract class My {
//     abstract public void show();
// }

// 3.
interface My {
    public void show();
}

class Outer {
    public void display() {
        new My() {
            public void show() {
                System.out.println("Hello");
            }
        }.show();
    }
}

// 1.
// class Outer {
//     public void display() {
//         class Inner {
//             public void show() {
//                 System.out.println("This is a show of Inner class");
//             }
//         }

//         // Inner obj=new Inner();
//         // obj.show();

//         new Inner().show();
//     }
// }

public class innerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
}
