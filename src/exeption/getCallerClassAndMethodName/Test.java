package exeption.getCallerClassAndMethodName;

public class Test {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        StackTraceElement caller = stackTrace[3];
        return caller.getClassName() + "#" + caller.getMethodName();
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
}
