
package codelaibai3.t2307m;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {

    private static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    private IdGenerate() {}

    public static Long getNewID() {
        Long result;
        lock.lock();
        try {
            result = ++id;
        } finally {
            lock.unlock();
        }
        return result;

    }
}
