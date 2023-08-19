package com.zzx.interpret;

import java.util.HashMap;

public class SubSymbolExpression extends SymbolExpression {

    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出 left 和 right 表达式相减后的结果
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
