// generated with ast extension for cup
// version 0.8
// 7/1/2022 3:1:25


package rs.ac.bg.etf.pp1.ast;

public class Number1 extends NumConst {

    public Number1 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Number1(\n");

        buffer.append(tab);
        buffer.append(") [Number1]");
        return buffer.toString();
    }
}
