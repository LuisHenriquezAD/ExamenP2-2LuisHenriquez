/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp2.pkg2luishenriquez;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    private Object data;
    private List<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public Object getData() {
        return data;
    }
}
 

