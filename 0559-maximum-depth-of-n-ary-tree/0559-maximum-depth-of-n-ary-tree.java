/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        
        if(root==null){
            return 0;
        }
        int ans=0;
        List<Node> children = root.children;
        for(int i=0;i<children.size();i++){
            
            int x = maxDepth(children.get(i));
            ans = Math.max(ans,x);
        }
        
        return ans+1;
    }
}