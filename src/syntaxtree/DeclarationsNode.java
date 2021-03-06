package syntaxtree;

import java.util.ArrayList;

/**
 * Represents a set of declarations in a Pascal program.
 */
public class DeclarationsNode extends SyntaxTreeNode {

    private ArrayList<VariableNode> vars = new ArrayList<VariableNode>();

    public void addVariable(VariableNode aVariable) {
        vars.add(aVariable);
    }

    public void addDeclarations(DeclarationsNode declarationsNode) {
        vars.addAll(declarationsNode.vars);
    }

    public String indentedToString(int level) {
        String answer = this.indentation(level);
        for(VariableNode variable : vars) {
            answer += variable.indentedToString(level + 1);
        }
        return answer;
    }
}
