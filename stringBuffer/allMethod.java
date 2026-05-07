package stringBuffer;

public class allMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() : concatenates the given args with strings
        sb.append("World");
        System.out.println("String after append :"+sb);

        // 2. insert() : inserts the given string at the specific position
        sb.insert(5,"Java");
        System.out.println("String after insert :"+sb);

        // 3. replace() : replaces the strings from specified beginIndex and endIndex
        sb.replace(5, 8, "CE");
        System.out.println("String after replace : "+sb);

        // 4.delete() deletes the string from specified begin and end index
        sb.delete(5, 6);
        System.out.println("String after delete :"+sb);

        // 5. reverse () : reverse the string
        sb.reverse();
        System.out.println("String after reversed : "+sb);

        // 6. capacity() : returns the current capacity of the buffer
        System.out.println("Capacity of string buffer :"+sb.capacity());
    }
}
