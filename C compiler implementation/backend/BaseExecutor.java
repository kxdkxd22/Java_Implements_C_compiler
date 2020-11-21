package backend;

import java.util.Collections;

public abstract class BaseExecutor implements Executor{
    protected void executeChildren(ICodeNode root){
        ExecutorFactory factory = ExecutorFactory.getExecutorFactory();
        Collections.reverse(root.getChildren());
        int i = 0;
        while(i<root.getChildren().size()){
            ICodeNode child = root.getChildren().get(i);
            Executor executor = factory.getExecutor(child);
            if(executor!=null){
                executor.Execute(child);
            }else{
                System.err.println("Not suitable Executor found, node is: "+child.toString());
            }

            i++;
        }
    }

    protected void copy(ICodeNode root, ICodeNode child){
        root.setAttribute(ICodeKey.SYMBOL,child.getAttribute(ICodeKey.SYMBOL));
        root.setAttribute(ICodeKey.TEXT,child.getAttribute(ICodeKey.TEXT));
        root.setAttribute(ICodeKey.VALUE,child.getAttribute(ICodeKey.VALUE));
    }

    protected ICodeNode executeChild(ICodeNode root,int childIndex){
        Collections.reverse(root.getChildren());
        ICodeNode child;
        child = root.getChildren().get(childIndex);
        ExecutorFactory factory = ExecutorFactory.getExecutorFactory();
        Executor executor =  factory.getExecutor(child);
        ICodeNode res= (ICodeNode) executor.Execute(child);
        Collections.reverse(root.getChildren());

        return res;
    }


}
