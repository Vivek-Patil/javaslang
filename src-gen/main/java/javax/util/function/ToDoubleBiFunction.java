/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.Function2;

@FunctionalInterface
public interface ToDoubleBiFunction<T, U> extends Function2<T, U, Double>, java.util.function.ToDoubleBiFunction<T, U> {

    static final long serialVersionUID = 1L;

    double applyAsDouble(T t, U u);

    @Override
    default Double apply(T t, U u) {
      return applyAsDouble(t, u);
    }

}