import java.util.*;

class SpecialStack {
    Stack<Long> st = new Stack<>();
    long min;

    public void push(int x) {
        if (st.isEmpty()) {
            st.push((long)x);
            min = x;
        } else if (x >= min) {
            st.push((long)x);
        } else {
            st.push(2L * x - min);
            min = x;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();

        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int peek() {
        if (st.isEmpty()) return -1;

        long top = st.peek();

        if (top >= min) return (int)top;

        return (int)min;
    }

    boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int)min;
    }
}