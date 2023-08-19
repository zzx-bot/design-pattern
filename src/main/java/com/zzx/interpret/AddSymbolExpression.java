package com.zzx.interpret;

import java.util.HashMap;

public class AddSymbolExpression extends SymbolExpression {

    public AddSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
