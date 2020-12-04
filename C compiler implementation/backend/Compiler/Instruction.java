package backend.Compiler;

public enum Instruction {
    LDC("ldc"),

    GETSTATIC("getstatic"),
    SIPUSH("sipush"),
    IADD("iadd"),
    IMUL("imul"),
    ISUB("isub"),
    IDIV("idiv"),
    INVOKEVIRTUAL("invokevirtual"),
    INVOKESTATIC("invokestatic"),
    RETURN("return"),
    IRETURN("ireturn"),
    ILOAD("iload"),
    ISTORE("istore"),
    NEWARRAY("newarray"),
    ASTORE("astore"),
    IASTORE("iastore"),
    ALOAD("aload"),
    IALOAD("iaload");

    private String text;
    Instruction(String s){this.text = s;}

    public String toString(){return text;}
}
