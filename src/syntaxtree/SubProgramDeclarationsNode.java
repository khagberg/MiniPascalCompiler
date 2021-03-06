package syntaxtree;

import java.util.ArrayList;

/**
 * Created by Kai on 2/14/17.
 */
public class SubProgramDeclarationsNode extends SyntaxTreeNode {

    private ArrayList<SubProgramDeclarationsNode> procs = new ArrayList<SubProgramDeclarationsNode>();

    public void addSubProgramDeclaration(SubProgramDeclarationsNode subProgram) {
        procs.add(subProgram);
    }

    public String indentedToString(int level) {
        String answer = this.indentation(level);
        answer += "SubProgramDeclarations\n";
        for(SubProgramDeclarationsNode subProg : procs) {
            answer += subProg.indentedToString(level+1);
        }
        return answer;
    }
}
